package model.entities;

import java.io.Serializable;

public class Branch implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String city;
	private String state;
	private String address;

	public Branch() {
	}

	public Branch(Integer id, String city, String state, String address) {
		this.id = id;
		this.city = city;
		this.state = state;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Branch [id=" + id + ", city=" + city + ", state=" + state 
		+ ", address=" + address + ", HashCode=" + hashCode() + "]";
	}
}
