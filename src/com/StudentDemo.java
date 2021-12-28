package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		Student s = new Student();
		System.out.println(s.name+"...."+s.pin);
		FileOutputStream fos = new FileOutputStream("F://pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		FileInputStream fis = new FileInputStream("F://pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		System.out.println(s.name+"...."+s.pin);
		

	}

}
