package com.university.entity;

public class Instructor {
	public String ID;
	public String name;
	public String dept_name;
	public float salary;
	
	public Instructor(String iD, String name, String dept_name, float salary) {
		super();
		ID = iD;
		this.name = name;
		this.dept_name = dept_name;
		this.salary = salary;
	}

	public Instructor() {
		super();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	
}
