package com.training.lang;

public class Student implements Cloneable {

	private String studentName;
	private int studentID;
	
	public Student() {
		super();
	}

	public Student(String studentName, int studentID) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentID=" + studentID + "]";
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Student) super.clone();
	}
	
}
