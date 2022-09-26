package com.training.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmployeeList {
	public static void main(String[] args) {
		List<Employee>employeeList=new ArrayList<>();
		Employee emloyee1=new Employee("sadik",39387,20000,"Assam");
		Employee employee2=new Employee("naveen",35632,25000,"Bangalore");
		Employee employee3=new Employee("satyaban",35633,25000,"Bhupal");
		Employee employee4=new Employee("sidhartha",35622,30000,"Bangalore");
		Employee employee5=new Employee("sharan",35631,35000,"Hyderabad");
	    employeeList.add(emloyee1);
	    employeeList.add(employee2);
	    employeeList.add(employee3);
	    employeeList.add(employee4);
	    employeeList.add(employee5);
	    List<Employee>employeesByCity=new ArrayList<Employee>();
	    
	    for(Employee employee:employeeList)
	    {
	    	if(employee.getCity().equalsIgnoreCase("bangalore"))
	    	{
	    		employeesByCity.add(employee);
	    	}
	    }
	    System.out.println();
	    System.out.println("aftre sorting");
	    Collections.sort(employeesByCity);
	    
	    for(Employee employee:employeesByCity)
	    {
	    	System.out.println(employee);
	    }
		
		
	}
}
