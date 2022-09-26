package com.training.custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaDemo {
	public static void main(String[] args) {
		List<Vehicle> vehicleList = Arrays.asList(new Vehicle("Xuv", "Mahindra", 600000),
				new Vehicle("Scorpio", "Mahindra", 700000), new Vehicle("Breza", "Suzuki", 1100000),
				new Vehicle("Baleno", "Suzuki", 800000), new Vehicle("Duster", "Renault", 700000));
		Comparator<Vehicle> bs = (Vehicle v1, Vehicle v2) -> {
			return v1.getBrand().compareTo(v2.getBrand());
		};
		Collections.sort(vehicleList, bs);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println(",,,,,,,");
		Collections.sort(vehicleList,(v1,v2)->v1.getMpdel().compareTo(v2.getMpdel()));
		Collections.sort(vehicleList, bs);
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		System.out.println(".......");
		Collections.sort(vehicleList,(v1,v2)->((Double)v1.getPrice()).compareTo(v2.getPrice()));
		for (Vehicle vehicle : vehicleList) {
			System.out.println(vehicle);
		}
		
	}

}
