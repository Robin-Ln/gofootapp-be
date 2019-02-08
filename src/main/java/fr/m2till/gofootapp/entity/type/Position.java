package fr.m2till.gofootapp.entity.type;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_position")
public class Position implements Serializable {

	private static final long serialVersionUID = -6097465951377211267L;


	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tb_sequence")
	@Column(name = "i_p_id")
	private Integer idPosition;

	@Column(name = "v_p_role")
	private String role;

	
	public Position() {

	}

	public Position(Integer idPosition, String role) {
		this.role = role;
		this.idPosition = idPosition;
	}

	// Methodes

	@Override
	public String toString() {
		return "Position{" + "idPosition=" + idPosition + ", role='" + role + '\'' + '}';
	}

	public Integer getIdPosition() {
		return idPosition;
	}

	public void setIdPosition(Integer idPosition) {
		this.idPosition = idPosition;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
}
