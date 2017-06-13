package pl.reaktor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class NewMember {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@NotEmpty(message = "{pl.reaktor.model.newMember.name.NotEmpty}")
	private String name;
	@NotEmpty(message = "{pl.reaktor.model.newMember.surname.NotEmpty}")
	private String surname;
	@Email(message = "{pl.reaktor.model.newMember.email.Email}")
	@NotEmpty(message = "{pl.reaktor.model.newMember.email.NotEmpty}")
	private String email;
	@NotEmpty(message = "{pl.reaktor.model.newMember.password.NotEmpty}")
	private String password;
	
	
	public NewMember() {};
	public NewMember(String name, String surname, String email, String password) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
