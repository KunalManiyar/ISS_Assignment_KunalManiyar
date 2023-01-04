package com.coreJava;

public class VariableTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Employee emp1=new Employee("Jay","Thakkar",2000);
	      emp1.printDetails();
	      
	      System.out.println(Employee.empCount);// Prints 1
	      
	      Employee emp2=new Employee("Mitesh","Shah",4000);
	      emp2.printDetails();
	      System.out.println(Employee.empCount);// Prints 2

	}
	 public void myAge() {
	      int age = 20;//age is a local variable as its scope is only limited to this method
	      age = age + 1;
	      System.out.println("My age is : " + age);
	      

	   }
}
class Employee{
	String fname,lname;		//Declaring instance variables,belongs to the object
	
	double salary;
	static int empCount=0;// There is one copy of each class/static variable per class and can be accessed through class name
	
	public Employee(String fname,String lname,double salary) {
		this.fname=fname;	//Initializing instance variables
		this.lname=lname;	
		this.salary=salary;
		empCount+=1;
	}
	public void printDetails() {	//Method used to print the details
		System.out.println("Name : "+fname+" "+lname);
		System.out.println("Salary : "+salary);
	}
}
