package com.coreJava.modifiers.pack2;

public class Person {
	 protected int age;
	 protected String fname,lname;

	 public Person(int age,String fname,String lname){
		 this.age=age;
		 this.fname=fname;
		 this.lname=lname;
	
	 }
	 
	 protected void printDetails() { //can be accessed within the package or in its subclasses
//		 System.out.println("Name : "+fname+" "+lname);
//		 System.out.println("Age : "+age);
		 
		 System.out.println("Name : "+fname+" "+lname);
		 System.out.println("Age : "+age);
		
	 }
}
