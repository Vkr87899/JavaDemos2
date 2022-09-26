package com.training.custom;

import java.util.function.Predicate;

public class EmployeeFunctionDemo {
	public static void main(String[] args) {
		Predicate<Employee>predicate=(emp)->
		{
			if(emp.getCity().equalsIgnoreCase("bangalore"))
					return true;
			return false;
		};
		System.out.println(predicate.test(new Employee("sadik",276573,337434,"bangalore")));
	}

}
