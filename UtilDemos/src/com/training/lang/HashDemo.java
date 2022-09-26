package com.training.lang;

public class HashDemo {
public static void main(String[] args) {
	Vehicle vehicle1=new  Vehicle("civic","Honda","black");
	Vehicle vehicle2=new Vehicle("civic","Honda","white");
	Vehicle vehicle3=new Vehicle("civic","Honda","white");
	Vehicle vehicle4=new Vehicle("A123","Audi","Red");
	System.out.println("Vehicle1 & vehicle2 :"+(vehicle1.equals(vehicle2)));
	System.out.println("Vehicle1 & vehicle3 :"+(vehicle1.equals(vehicle3)));
	System.out.println("Vehicle1 & vehicle4 :"+(vehicle1.equals(vehicle4)));
	System.out.println("vehicle1 "+vehicle1.hashCode());
	System.out.println("vehicle2 "+vehicle2.hashCode());
	System.out.println("vehicle3 "+vehicle3.hashCode());
	System.out.println("vehicle4 "+vehicle4.hashCode());
		
}
}
