package model.entities;

import java.io.Serializable;
import java.util.Date;

public class CostumerAccount implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Date openDate = null;
	private Date closeDate = null;
	private Character status = null;
	
	private Costumer costumer;
	private CostumerAccount account;

	public CostumerAccount() {
	}

	public CostumerAccount(
		Integer id,
		Costumer costumer,
		CostumerAccount account
	) {
		this.id = id;
	
		this.costumer = costumer;
		this.account = account;
	}
	
	public CostumerAccount(
		Integer id,
		Date openDate,
		Costumer costumer,
		CostumerAccount account
	) {
		this.id = id;
	
		this.openDate = openDate;
		
		this.costumer = costumer;
		this.account = account;
	}
	
	public CostumerAccount(
		Integer id,
		Date openDate,
		Date closeDate,
		Costumer costumer,
		CostumerAccount account
	) {
		this.id = id;
	
		this.openDate = openDate;
		this.closeDate = closeDate;
		
		this.costumer = costumer;
		this.account = account;
	}

	public CostumerAccount(
		Integer id,
		Date openDate,
		Character status,
		Costumer costumer,
		CostumerAccount account
	) {
		this.id = id;
	
		this.openDate = openDate;
		this.status = status;
		
		this.costumer = costumer;
		this.account = account;
	}

	public CostumerAccount(
		Integer id,
		Date openDate,
		Date closeDate,
		Character status,
		Costumer costumer,
		CostumerAccount account
	) {
		this.id = id;
	
		this.openDate = openDate;
		this.closeDate = closeDate;
		this.status = status;
		
		this.costumer = costumer;
		this.account = account;
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

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Character getStatus() {
		return this.status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Costumer getCostumer() {
		return this.costumer;
	}

	public void setCostumer(Costumer costumer) {
		this.costumer = costumer;
	}

	public CostumerAccount getAccount() {
		return this.account;
	}

	public void setAccount(CostumerAccount account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "CostumerAccount [id=" + id + ", openDate=" + openDate + ", closeDate=" + closeDate 
		+ ", status=" + status + ", HashCode=" + hashCode() 
		+ ", costumer=" + costumer + ", account=" + account + "]";
	}

}
