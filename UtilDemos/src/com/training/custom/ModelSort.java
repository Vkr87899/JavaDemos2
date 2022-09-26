package com.training.custom;

import java.util.Comparator;

public class ModelSort implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		// TODO Auto-generated method stub
		return o1.getMpdel().compareTo(o2.getMpdel());
	}

}
