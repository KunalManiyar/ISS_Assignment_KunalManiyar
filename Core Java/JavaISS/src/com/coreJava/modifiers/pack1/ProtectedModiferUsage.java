package com.coreJava.modifiers.pack1;
import com.coreJava.modifiers.pack2.Person;// has protected variables and methods
public class ProtectedModiferUsage{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(21,20000,"Kunal","Maniyar");
		emp.printEmployeeDetails();
		
		
	}

}
class Employee extends Person{
	public int salary;
	Employee(int age,int salary,String fname,String lname){
		super(age,fname,lname);
		this.salary=salary;
	}
	void printEmployeeDetails() {
		printDetails();// can be accessed  
		System.out.println("Salary : "+salary);
	}
}