package com.userapp.service;

import com.userapp.exceptions.NameExistException;
import com.userapp.exceptions.TooLongExceptios;
import com.userapp.exceptions.TooShortException;

public interface IValidationService {

	boolean validateUserName(String userName) throws NameExistException;
	boolean validatePassowrd(String passWord) throws TooShortException, TooLongExceptios;
}
