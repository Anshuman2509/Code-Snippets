package com.bmw.stereotypeAnnotations;

import org.springframework.stereotype.Repository;

@Repository
public class Department {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + "]";
	}
	

}
