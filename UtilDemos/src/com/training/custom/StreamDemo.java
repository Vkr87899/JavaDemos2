package com.training.custom;

import java.util.Arrays;
import java.util.Optional;

public class StreamDemo {
	public static void main(String[] args) {
		Arrays.asList("java", "html", "javascript", "css", "json", "angular")
		.stream().map((str) -> str
				.toUpperCase())
				.sorted()
				.limit(4)
				.forEach(System.out::println);
		Arrays.asList("java", "html", "javascript", "css", "json", "angular").stream().map((str) -> str.length())
				.forEach(System.out::println);
		Optional<String> optString = Arrays.asList("java", "html", "javascript", "css", "json", "angular").stream()
				.filter((str) -> str.length() > 3)
				// .sorted().limit(4).forEach(System.out::println)
				.findFirst();

		if (optString.isPresent()) {
			String value = optString.get();
			System.out.println(value);
		}
		String course = Arrays.asList("java", "html", "javascript", "css", "json", "angular").stream()
				.filter(str -> str.length() < 2).findFirst().orElse("react");
		System.out.println(course);
		course = Arrays.asList("java", "html", "javascript", "css", "json", "angular").stream()
				.filter(str -> str.length() < 2).findFirst().orElseGet(() -> "react".toUpperCase());
		System.out.println(course);
		course = Arrays.asList("java", "html", "javascript", "css", "json", "angular").stream()
				.filter(str -> str.length() < 2).findFirst().orElseThrow(()->new ArithmeticException());
		System.out.println(course);
	}
}
