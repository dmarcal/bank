package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Date date;
	private Character creditDebit;
	
	private Float value = null;
	
	private TransactionType transactionType;
	private Transaction account;

	public Transaction() {
	}
	
	public Transaction(
		Integer id, Date date, Character creditDebit, 
		TransactionType transactionType, Transaction account
	) {
		this.id = id;
		this.date = date;
		this.creditDebit = creditDebit;
	
		this.transactionType = transactionType;
		this.account = account; 
	}

	public Transaction(
		Integer id, Date date, Character creditDebit, Float value,
		TransactionType transactionType, Transaction account
	) {
		this.id = id;
		this.date = date;
		this.creditDebit = creditDebit;
		this.value = value;
	
		this.transactionType = transactionType;
		this.account = account; 
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Character getCreditDebit() {
		return this.creditDebit;
	}

	public void setCreditDebit(Character creditDebit) {
		this.creditDebit = creditDebit;
	}

	public Float getValue() {
		return this.value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public TransactionType getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

	public Transaction getAccount() {
		return this.account;
	}

	public void setAccount(Transaction account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", date=" + date + ", creditDebit=" + creditDebit 
		+ ", value=" + value + ", HashCode=" + hashCode() 
		+ ", transactionType=" + transactionType + ", account=" + account + "]";
	}

}
