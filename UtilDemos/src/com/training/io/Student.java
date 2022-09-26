package com.training.io;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private transient String department;
	private int  studentId;
	public Student(String name, String department, int studentId) {
		super();
		this.name = name;
		this.department = department;
		this.studentId = studentId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", studentId=" + studentId + "]";
	}
	
}
