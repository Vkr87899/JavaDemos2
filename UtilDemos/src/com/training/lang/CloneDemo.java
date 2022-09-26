package com.training.lang;

public class CloneDemo {

	public static void main(String[] args) {
		Student student=new  Student("Sri",1);
		System.out.println(student);
		Student student1=null;
		try {
			student1=student.clone();
			System.out.println(student1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(student1);
		System.out.println(student==student1);
		System.out.println(student.equals(student1));
		System.out.println(student.getClass()==student1.getClass());
				
	}
}
