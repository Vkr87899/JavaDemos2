package com.training.lang;

public class Employee {

	String name;
	int employeeId;
	String department;
	public void  setName(String name)
	{
		this.name=name;
	
	}
	public String getName()
	{
		return name;
	}
	public void setEmp_Id(int employeeId)
	{
		this.employeeId=employeeId;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}
	public void  setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", department=" + department + "]";
	}
	
	
	
}
