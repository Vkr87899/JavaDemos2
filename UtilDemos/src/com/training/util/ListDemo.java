package com.training.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	System.out.println(list.size());
	list.add("priya");
	list.add("sri");
	list.set(1, "mona");
	list.add("priya");
	list.add(2,"joe");
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	System.out.println(list.size());
	Iterator<String> it= list.iterator();
	while(it.hasNext())
	{
		String name=it.next();
		System.out.println("name "+name);
		//list.add("kevin");
		it.remove();
				
	}
	System.out.println(list);
	System.out.println(",,,,");
	ListIterator<String>listit=list.listIterator(list.size());
	while(listit.hasPrevious())
	{
		String name=listit.previous();
		System.out.println("name "+name);
				
	}
}
}
