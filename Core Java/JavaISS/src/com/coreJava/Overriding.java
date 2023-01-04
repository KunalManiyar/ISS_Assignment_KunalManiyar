package com.coreJava;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();
		animal.move();
		//animal.sound();//can't be accessed, also known as upcasting
		
		Dog dog=new Dog();
		dog.move();
	}

}

class Animal{
	public void move() {
		System.out.println("Move");
	}
}
class Dog extends Animal{
	public void move() {
		super.move();// Invokes the super class method
		System.out.println("Move and run");
	}
	
	public void sound() {
		System.out.println("Bark");
	}
}