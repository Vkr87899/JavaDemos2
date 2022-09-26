package com.training.ref;

public class StaticRefDemo {

	public static void main(String[] args) {
		// using lamda
		ICalculator object = (x, y) -> System.out.println("sum " + (x + y));
		object.calculate(55, 9);
		// using method references for static method
		
		ICalculator calculations = Checker::printTotal;
		calculations.calculate(20, 30);
		IGreeter reference = (name) -> System.out.println("welceome to VFISLK :" + name);
		reference.greetMessag("Sadik");
		System.out.println();
		//create an object of checker
		Checker checkobject=new Checker();
		IGreeter greetRef=checkobject::show;
		greetRef.greetMessag("naveen");
		

	}
}
