package com.userapp.client;

import java.util.Scanner;

import com.userapp.service.ValidationServiceImpl;

public class RegisterMain {
	public static void main(String[] args) {
		ValidationServiceImpl register=new ValidationServiceImpl();
		String userName=null,passWord=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("register yourself");
		System.out.println("enter the name for login");
		userName=sc.next();
		try
		{
			if(register.validateUserName(userName))
			{
			System.out.println("now enter the passsword");
			passWord=sc.next();
			
			if(register.validatePassowrd(passWord))
			System.out.println("welcome to VFISLK");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
