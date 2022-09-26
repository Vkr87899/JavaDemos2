package com.training.custom;

public class Employee implements Comparable<Employee>{

	private String name;
	private Integer employeeId;
	
	private double salary;
	private  String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Integer employeeId, double salary, String city) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
//		Double sal1=this.getSalary();
//		Double sal2=this.getSalary();
//		return sal1.compareTo(sal2);
		return ((Double)this.getSalary()).compareTo(o.getSalary());
	}
	
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.getCity().compareTo(o.getCity());
//	
	
	//}
	
}
