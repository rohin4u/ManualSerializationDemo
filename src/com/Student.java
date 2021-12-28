package com;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	
	String name	= "manoj";
	transient int pin = 3456;
	 
	protected void writeObject(ObjectOutputStream oos) throws IOException
	{
		oos.defaultWriteObject();
		String sname = "kumar"+name;
		int spin = 3456+1234;
		oos.writeObject(sname);
		oos.writeInt(spin);
		System.out.println(name+"...."+pin);
	
	}
	protected void readObject(ObjectInputStream ois)throws IOException, ClassNotFoundException
	{
		ois.defaultReadObject();
		String sname = (String) ois.readObject();
		name = sname.substring(5);
		int spin = ois.readInt();
		pin = spin-1234;
		System.out.println(name+"...."+pin);
		
		
	}
	
	

}
