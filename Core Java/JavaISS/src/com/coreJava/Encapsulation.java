package com.coreJava;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Encapsulation : it is a protective shield that prevents the data from being accessed by the code outside this shield. 
		Encapsulate obj = new Encapsulate();
		 
        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());
 
        // Direct access of Roll is not possible
        // due to encapsulation
        // System.out.println(" roll: " +
        // obj.geekName);
	}

}

class Encapsulate{
	//can only be accessed through public methods
	private String name;
	private int roll;
	private int age;
	
	
	//get method for getting private name
	public String getName() {
		return name;
	}
	//set method for initializing private name
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}