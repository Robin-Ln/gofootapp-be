package fr.m2till.gofootapp.helpers;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by neolitec on 01/12/2015.
 */
public class HQLBuilder {

    private String select;
    private String from;
    private Map<String, Object[]> joins = new LinkedHashMap<>();
    private Map<String, Object[]> criterias = new LinkedHashMap<>();
    private Map<String, String> orderBys = new LinkedHashMap<>();
    private List<String> groupBys = new ArrayList<>();
    private Map<String, Object[]> havings = new LinkedHashMap<>();

    public static String and(String... ops) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Arrays.asList(ops).stream().collect(Collectors.joining(" and ")));
        sb.append(")");
        return sb.toString();
    }

    public static String and(Collection ops) {
        return and((String[]) ops.stream().toArray(String[]::new));
    }

    public static String or(String... ops) {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Arrays.asList(ops).stream().collect(Collectors.joining(" or ")));
        sb.append(")");
        return sb.toString();
    }

    public static String or(Collection ops) {
        return or((String[]) ops.stream().toArray(String[]::new));
    }

    public HQLBuilder() {

    }

    public HQLBuilder(HQLBuilder builder) {
        this.select = builder.getSelect();
        this.from = builder.getFrom();
        this.criterias = new LinkedHashMap<>(builder.getCriterias());
        this.orderBys = new LinkedHashMap<>(builder.getOrderBys());
        this.groupBys = new ArrayList<>(builder.getGroupBys());
        this.havings = new LinkedHashMap<>(builder.getHavings());
    }

    public HQLBuilder select(String select) {
        this.select = select;
        return this;
    }

    public HQLBuilder from(String from) {
        this.from = from;
        return this;
    }

    public HQLBuilder where(String field, Object... parameters) {
        criterias.put(field, parameters);
        return this;
    }

    public HQLBuilder orderBy(String field) {
        orderBy(field, "asc");
        return this;
    }

    public HQLBuilder orderBy(String field, String order) {
        orderBys.put(field, order);
        return this;
    }

    public HQLBuilder groupBy(String group) {
        groupBys.add(group);
        return this;
    }

    public HQLBuilder having(String field, Object... parameters) {
        havings.put(field, parameters);
        return this;
    }

    public HQLBuilder resetWhere() {
        criterias.clear();
        return this;
    }

    public HQLBuilder resetOrderBys() {
        orderBys.clear();
        return this;
    }

    public HQLBuilder resetGroupBys() {
        groupBys.clear();
        return this;
    }

    public HQLBuilder resetHaving() {
        havings.clear();
        return this;
    }

    public Query build(EntityManager em) {
        Query query = em.createQuery(build());

        int paramIdx = 0;

        // Inject where parameters
        for (Object value : criterias.values()) {
            paramIdx = applyParameters(query, value, paramIdx);
        }

        // Inject having parameters
        for (Object value : havings.values()) {
            paramIdx = applyParameters(query, value, paramIdx);
        }

        return query;
    }

    public String build() {
        StringBuilder sb = new StringBuilder();

        if (null != select) {
            sb.append("select ").append(select).append(" ");
        }

        if (null == from) {
            throw new RuntimeException("from element is mandatory");
        }

        sb.append("from ").append(from);

        if (criterias.size() > 0) {
            sb.append(" where ").append(criterias.keySet().stream().collect(Collectors.joining(" and ")));
        }

        if (groupBys.size() > 0) {
            sb.append(" group by ").append(groupBys.stream().collect(Collectors.joining(", ")));
        }

        if (havings.size() > 0) {
            sb.append(" having ").append(havings.keySet().stream().collect(Collectors.joining(" and ")));
        }

        if (orderBys.size() > 0) {
            sb.append(" order by ").append(orderBys.entrySet().stream()
                    .map(entry -> entry.getKey() + " " + entry.getValue())
                    .collect(Collectors.joining(", ")));
        }

        return sb.toString();
    }

    public String getSelect() {
        return select;
    }

    public String getFrom() {
        return from;
    }

    public Map<String, Object[]> getCriterias() {
        return criterias;
    }

    public Map<String, String> getOrderBys() {
        return orderBys;
    }

    public List<String> getGroupBys() {
        return groupBys;
    }

    public Map<String, Object[]> getHavings() {
        return havings;
    }

    private int applyParameters(Query query, Object value, int paramIdx) {
        if (value instanceof Object[]) {
            for (Object parameter : (Object[]) value) {
                query.setParameter(paramIdx, parameter);
                ++paramIdx;
            }
        } else if (value instanceof Collection) {
            for (Object parameter : (Collection) value) {
                query.setParameter(paramIdx, parameter);
                ++paramIdx;
            }
        } else {
            query.setParameter(paramIdx, value);
            ++paramIdx;
        }

        return paramIdx;
    }

}

