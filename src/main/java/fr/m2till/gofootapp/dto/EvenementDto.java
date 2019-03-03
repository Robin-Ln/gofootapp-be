package fr.m2till.gofootapp.dto;

import java.util.Calendar;

public class EvenementDto {

    /**
     * Attributs
     */

    Integer id;

    String title;

    Calendar start;

    Calendar end;


    /**
     * Constructeur
     */
    public EvenementDto() {
    }

    /**
     * Accesseurs
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getStart() {
        return start;
    }

    public void setStart(Calendar start) {
        this.start = start;
    }

    public Calendar getEnd() {
        return end;
    }

    public void setEnd(Calendar end) {
        this.end = end;
    }
}
