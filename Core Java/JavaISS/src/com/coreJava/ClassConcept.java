package com.coreJava;

public class ClassConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details myDetail=new Details("Kunal","Maniyar",21); //Creating object of class Details
		myDetail.printDetails();
	
	}
	

}

class Details{
	String fname,lname;		//Declaring instance variables
	int age;
	
	public Details(String fname,String lname,int age) {
		this.fname=fname;	//Initializing instance variables
		this.lname=lname;	
		this.age=age;
	}
	public void printDetails() {	//Method used to print the details
		System.out.println("Name : "+fname+" "+lname);
		System.out.println("Age : "+age);
	}
}
