package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialStudent {
public static void main(String[] args) {
	
	try(FileInputStream fs=new FileInputStream("test.ser");
			ObjectInputStream in=new ObjectInputStream(fs);
			)
	{
	  Student	student =(Student) in.readObject();
		System.out.println(student);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		// TODO: handle exception

	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}
}