package model.entities;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String number;
	private String zipCode;
	private String complement = "";
	
	private City city;
	private Costumer costumer;
	private AddressType addressType;

	public Address() {
	}

	public Address(
		Integer id, String name, String number, String zipCode, 
		City city, Costumer costumer, AddressType addressType
	) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.zipCode = zipCode;
		
		this.city = city;
		this.costumer = costumer;
		this.addressType = addressType;
	}

	public Address(
		Integer id, String name, String number, String zipCode, String complement, 
		City city, Costumer costumer, AddressType addressType
	) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.zipCode = zipCode;
		this.complement = complement;
		
		this.city = city;
		this.costumer = costumer;
		this.addressType = addressType;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getComplement() {
		return this.complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public AddressType getAddressType() {
		return this.addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + ", number=" + number + ", zipCode=" + zipCode 
		+ ", complement=" + complement + ", HashCode=" + hashCode()
		+ ", city=" + city + ", costumer=" + costumer 
		+ ", addressType=" + addressType + "]";
	}
}
