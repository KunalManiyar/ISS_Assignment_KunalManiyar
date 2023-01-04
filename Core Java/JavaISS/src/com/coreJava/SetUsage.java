package com.coreJava;
import java.util.HashSet;
public class SetUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);//Unique values will be stored in any order
	    
	    //Check if item exists
	    System.out.println(cars.contains("Mazda"));
	    
	    cars.remove("Volvo");
	    System.out.println(cars);
	    
	    for (String i : cars) {
	    	  System.out.println(i);
	    	}
	    
	}

}
