package model.entities;

import java.io.Serializable;

public class Manager implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String taxId;
	private Integer directManager = 0;
	
	private Branch branch;

	public Manager() {
	}

	public Manager(Integer id, String name, String taxId, Branch branch) {
		this.id = id;
		this.name = name;
		this.taxId = taxId;

		this.branch = branch;
	}

	public Manager(Integer id, String name, String taxId, Integer directManager, Branch branch) {
		this.id = id;
		this.name = name;
		this.taxId = taxId;
		this.directManager = directManager;

		this.branch = branch;
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

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public Integer getDirectManager() {
		return this.directManager;
	}

	public void setDirectManager(Integer directManager) {
		this.directManager = directManager;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", taxId=" + taxId 
		+ ", directManager=" + directManager  + ", HashCode=" + hashCode() 
		+ ", branch=" + branch + "]";
	}

}
