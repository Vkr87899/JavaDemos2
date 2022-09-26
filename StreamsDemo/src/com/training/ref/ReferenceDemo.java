package com.training.ref;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReferenceDemo {
	public static void main(String[] args) {
//		IShape shape = (lenght) -> lenght * lenght;
//		double area = shape.areaOfSquare(12);
//		System.out.println("area of square " + area);
//		IMetricsChanger converter = (grams) -> grams / 1000.0;
//		double gramToKg = converter.convertGmsToKgs(25000);
//		System.out.println("Gram to Kgs " + gramToKg);
//		IStudentDetails studentdetails = (mark1, mark2, mark3) -> System.out
//				.println("sum off marks  is " + (mark1 + mark2 + mark3));
//		studentdetails.calTotal(50, 80, 80);
//		ICourseDetails ref = () -> Arrays.asList("jsp", "java");
//		System.out.println("courselist " + ref.showCourses());
        
		Arrays.asList("java","html","javascrit","css","angular")
		.forEach(courseName->System.out.println(courseName.toUpperCase()));
		Arrays.asList("java","html","javascrit","css","angular")
		.forEach(System.out::println);
		Stream.generate(()->"priya").limit(5).forEach(str->System.out.println(str.toUpperCase()));
		
	}

}