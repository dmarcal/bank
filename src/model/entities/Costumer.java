package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Costumer implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Date birhDate;
	private String phoneNumber = "";
	private String email = "";
	
	public Costumer() {
	}


	public Costumer(Integer id) {
		this.id = id;
	}

	public Costumer(Integer id, String name, Date birhDate) {
		this.id = id;
		this.name = name;
		this.birhDate = birhDate;
	}

	public Costumer(Integer id, String name, Date birhDate, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.birhDate = birhDate;
		this.phoneNumber = phoneNumber;
	}

	public Costumer(Integer id, String name, Date birhDate, String phoneNumber, String email) {
		this.id = id;
		this.name = name;
		this.birhDate = birhDate;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirhDate() {
		return birhDate;
	}

	public void setBirhDate(Date birhDate) {
		this.birhDate = birhDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Costumer [id=" + id + ", name=" + name + ", birhDate=" + birhDate 
		+ ", phoneNumber=" + phoneNumber + ", email=" + email
		+ ", HashCode=" + hashCode() + "]" ;
	}
}
