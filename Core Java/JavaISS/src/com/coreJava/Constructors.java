package com.coreJava;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructors must have the same name as the class within which it is defined 
//		Constructors do not return any type 
//		Constructors are called only once at the time of Object creation 

		Student student1=new Student();// this would invoke default constructor.
	    // Default constructor provides the default values to the object like 0, null
		System.out.println(student1);

        
        System.out.println();
        
        
        Student student2=new Student("Kunal",1,"COMPS"); // This would invoke the parameterized constructor.
        System.out.println(student2);
        
        System.out.println();
        
        Student student3=new Student(student2);
        System.out.println(student3);
        
        
        System.out.println();
        
//      Constructor chaining is the process of calling one constructor from another constructor with respect to current object. 
        new ConstructorChaining();//Constructor chaining
        

	}

}

class Student{
	String name,dept;
	int rollno;
	
	Student(){
		System.out.println("Employee constructor called");
	}
	
	Student(Student stud){//Copy constructor
		this.name=stud.name;
		this.dept=stud.dept;
		this.rollno=stud.rollno;
	}
	
	//A constructor that has parameters is known as parameterized constructor. 
	//If we want to initialize fields of the class with our own values, then use a parameterized constructor.
	
	Student(String name,int rollno,String dept){
		this.name=name;
		this.rollno=rollno;
		this.dept=dept;
	}
	
	public String toString() {
		return "Name : "+name+"\nDepartment : "+dept+"\nRollno : "+rollno;
	}
}


class ConstructorChaining
{
	ConstructorChaining()
    {
        this(5);
        System.out.println("The Default constructor");
    }
 
	ConstructorChaining(int x)
    {
        this(5, 15);
        System.out.println(x);
    }
 
	ConstructorChaining(int x, int y)
    {
        System.out.println(x + y);
    }
 
}

