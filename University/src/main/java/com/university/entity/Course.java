package com.university.entity;

public class Course {

	public String course_id;
	public String title;
	public String dept_name;
	public float credits;
	
	public Course(String course_id, String title, String dept_name, float credits) {
		super();
		this.course_id = course_id;
		this.title = title;
		this.dept_name = dept_name;
		this.credits = credits;
	}

	public Course() {
		super();
	}

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public float getCredits() {
		return credits;
	}

	public void setCredits(float credits) {
		this.credits = credits;
	}
	
	
}
