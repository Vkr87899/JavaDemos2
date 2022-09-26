package com.userapp.service;

import com.userapp.exceptions.NameExistException;
import com.userapp.exceptions.TooLongExceptios;
import com.userapp.exceptions.TooShortException;

public class ValidationServiceImpl implements IValidationService {
	String name[]= {"ram","sham","tom","jarry"};
	@Override
	public boolean validateUserName(String userName) throws NameExistException{
		// TODO Auto-generated method stub
		for(String value:name)
		{
			if(userName.equals(value))
			{
				throw new NameExistException("name already exist");
			}
		}
		return true;
	}

	@Override
	public boolean validatePassowrd(String passWord)throws TooShortException,TooLongExceptios {
		// TODO Auto-generated method stub
		if(passWord.length()<5)
		{
			throw new TooShortException("try a longger password");
		}
		else if(passWord.length()>10)
		{
			throw new TooLongExceptios("try a short password");
		}
		else
		return true;
	}
	
	
}
