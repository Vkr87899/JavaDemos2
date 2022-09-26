package com.training.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterStream {

	public static void main(String[] args) {
		//create a list, convert to stream
		//apply filter
		//sort the element
		//collect stream and convert to list
		
		List<String>courses=
				Arrays.asList("java","html","javascript","css","Json","agular")
				.stream()
				.filter((str)->str.startsWith("j"))
				.sorted()
				.collect(Collectors.toList());
		System.out.println(courses);
		
		//this is called method chaining;
		
		
	}
}
