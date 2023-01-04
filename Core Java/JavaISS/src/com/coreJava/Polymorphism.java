package com.coreJava;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runtime polymorphism also called as method overriding
		
		
		
		//Compile Time Polymorphism
//		Method Overloading: When there are multiple functions with the same name but
//		different parameters then these functions are said to be overloaded
		double product1=Helper.Multiply(2.5, 2.0);
		System.out.println(product1);
		
		int product2=Helper.Multiply(5, 2);
		System.out.println(product2);
		
		int product3=Helper.Multiply(5, 2,3);
		System.out.println(product3);
		
		
	
	}

}

class Helper {
	 
	//Method 1
    // Method with 2 integer parameters
    static int Multiply(int a, int b)
    {
 
        // Returns product of integer numbers
        return a * b;
    }
 
    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {
 
        // Returns product of double numbers
        return a * b;
    }
    
  // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {
 
        // Return product
        return a * b * c;
    }
}