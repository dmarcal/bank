package model.entities;

import java.io.Serializable;

public class TransactionType implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String description;
	
	public TransactionType() {
	}

	public TransactionType(Integer id, String description) {
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "TransactionType [id=" + id + ", description=" + description + ", HashCode=" + hashCode() + "]";
	}
}
