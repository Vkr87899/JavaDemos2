package com.training.custom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VehicleMain {

	public static void main(String[] args) {
		List<Vehicle>vehicleList=new ArrayList<>();
		vehicleList.add(new Vehicle("Xuv","Mahindra",600000));
		vehicleList.add(new Vehicle("Scorpio","Mahindra",700000));
		vehicleList.add(new Vehicle("Breza","Suzuki",1100000));
		vehicleList.add(new Vehicle("Baleno","Suzuki",800000));
		vehicleList.add(new Vehicle("Duster","Renault",700000));
		for(Vehicle vehicle:vehicleList)
		{
			System.out.println(vehicle);
		}
		//Comparator<Vehicle>brandRef=new SortByBrand();
		Collections.sort(vehicleList, new SortByBrand());
		System.out.println("sorted by brand");
		for(Vehicle vehicle:vehicleList)
		{
			System.out.println(vehicle);
		}
		System.out.println();
		System.out.println("sorted b model");
		Collections.sort(vehicleList, new ModelSort());
		for(Vehicle vehicle:vehicleList)
		{
			System.out.println(vehicle);
		}
		
	 
		
	}
}
