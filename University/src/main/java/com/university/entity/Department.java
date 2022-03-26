package com.university.entity;

public class Department {
	
	public String dept_name;
	public String building;
	public float budget;
	
	public Department(String dept_name, String building, float budget) {
		super();
		this.dept_name = dept_name;
		this.building = building;
		this.budget = budget;
	}

	public Department() {
		super();
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}

	
}
