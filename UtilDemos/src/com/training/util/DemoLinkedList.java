package com.training.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<String>();
	System.out.println(list.size());
	list.add("piya");
	list.add("sri");
	list.set(1,"mona");
	list.add("priya");
	list.add(2,"joe");
	list.addFirst("kathy");
	list.addLast("lenin");
	System.out.println(list);
	System.out.println(list.size());
	Iterator<String>it=list.iterator();
	while(it.hasNext())
	{
		String name=it.next();
		System.out.println("name "+name);
		
	}
	for(String uname:list)
	{
		System.out.println(uname);
	}
	System.out.println();
	ListIterator<String>listit=list.listIterator(list.size());
	while(listit.hasPrevious())
	{
		String name=listit.previous();
		System.out.println("name "+name);
				
	}
}
}
