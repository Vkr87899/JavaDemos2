package com.training.util;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String>hashSet=new TreeSet<String>();
		System.out.println(hashSet.size());
		hashSet.add("priya");
		hashSet.add("sri");
		hashSet.add("joe");
		hashSet.add("kelly");
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
	}

}
