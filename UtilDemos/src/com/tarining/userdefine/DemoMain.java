package com.tarining.userdefine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DemoMain {
	public static void main(String[] args) {
		Policy policy1 = new Policy("jeevan", "life", "LIC");
		Policy policy2 = new Policy("Bandhan", "home", "Rose");
		Policy policy3 = new Policy("bachsat", "health", "Bajaj");
		Policy policy4 = new Policy("retiremnt", "health", "voya");
		Policy policy5 = new Policy("wealth", "investement", "Voya");
		List<Policy> policies = new ArrayList<Policy>();
		List<Policy> policiesNew = new ArrayList<Policy>();
		policies.add(policy1);
		policies.add(policy2);
		policies.add(policy3);
		policies.add(policy4);
		policies.add(policy5);
		System.out.println("enter the policytype");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		;
		for (Policy value : policies) {
			if (value.getType().equalsIgnoreCase(input)) {
				policiesNew.add(value);
			}
			else
			{
				System.out.println("invalid input");
				break;
			}
		}
		Iterator<Policy> check = policiesNew.iterator();
		while (check.hasNext()) {
			System.out.println(check.next());
		}
		sc.close();
	}

}
