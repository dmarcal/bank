package model.entities;

import java.io.Serializable;

public class State implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String code;
	
	public State() {
	}

	public State(Integer id, String code) {
		this.id = id;
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", code=" + code + ", HashCode=" + hashCode() + "]";
	}
}
