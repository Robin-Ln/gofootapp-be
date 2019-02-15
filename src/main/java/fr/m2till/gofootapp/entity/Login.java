package fr.m2till.gofootapp.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_login")
public class Login {

	// Attributs

	@Id
	@Column(name = "v_l_mail")
	private String mail;

	@Column(name = "v_l_password")
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_l_date_expiration")
	private Calendar dateExpiration;

	public Calendar getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Calendar dateExpiration) {
		this.dateExpiration = dateExpiration;
	}


	// Constructeur
	
	public Login() {
		
	}

	// Methodes

	@Override
	public String toString() {
		return "Login{" + "mail='" + mail + '\'' + ", password='" + password + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Login login = (Login) o;
		return Objects.equals(getMail(), login.getMail()) && Objects.equals(getPassword(), login.getPassword());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMail(), getPassword());
	}

	// Accesseurs

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
