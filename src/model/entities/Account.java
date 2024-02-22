package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date openDate;
	private Character status;
	private Float balance;
	private Float limit;

	private Date closeDate = null;
	
	private Branch branch;
	private Manager manager;

	public Account() {
	}

	public Account(
		Integer id, Date openDate, Character status, Float balance,
		Float limit, Branch branch, Manager manager
	) {
		this.id = id;
		this.openDate = openDate;
		this.status = status;
		this.balance = balance;
		this.limit = limit;
	
		this.branch = branch;
		this.manager = manager; 
	}

	public Account(
		Integer id, Date openDate, Character status, Float balance, Float limit, 	
		Date closeDate,	Branch branch, Manager manager
	) {
		this.id = id;
		this.openDate = openDate;
		this.status = status;
		this.balance = balance;
		this.limit = limit;
	
		this.closeDate = closeDate;
		
		this.branch = branch;
		this.manager = manager; 
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Float getLimit() {
		return this.limit;
	}

	public void setLimit(Float limit) {
		this.limit = limit;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Manager getManager() {
		return this.manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", openDate=" + openDate + ", status=" + status 
		+ ", balance=" + balance + ", limit=" + limit + ", closeDate=" + closeDate 
		+ ", HashCode=" + hashCode() 
		+ ", branch=" + branch + ", manager=" + manager + "]";
	}

}
