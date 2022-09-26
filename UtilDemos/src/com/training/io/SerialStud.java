package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {
public static void main(String[] args) {
	Student student =new Student("sadik","tower head ",33880);
	System.out.println("serializing "+student);
	FileOutputStream fs=null;
	ObjectOutputStream os=null;
	try
	{
		fs=new FileOutputStream("test.ser");
		os=new ObjectOutputStream(fs);
		os.writeObject(student);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
		// TODO: handle exception
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
			

finally
{
	try
	{
		if(os!=null)
			os.close();
		if(fs!=null)
			fs.close();
	}
	catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
}
