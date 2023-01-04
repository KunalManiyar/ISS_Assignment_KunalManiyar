package com.coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class ListUsage {

	public static void main(String[] args) {


		ArrayList<String> arrayList=new ArrayList<>();
		
		//adding few elements
		arrayList.add("Apple");
		arrayList.add("Banana");
		
		//inserting element at first position, index 0
		arrayList.add(0,"Grapes");
		
		
		System.out.println("ArrayList Elements :");
		//Printing Elements
		for(int i=0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		
		System.out.println();
		//Printing elements Using Enhanced Loop
		for(String str:arrayList) {
			System.out.println(str);
		}
		
		arrayList.set(0, "Pineapple");
		System.out.println();
		//Printing elements Using Enhanced Loop
		for(String str:arrayList) {
			System.out.println(str);
		}
		
		//Sorting the arraylist using collections
		System.out.println("Before Sorting");
		for(String str:arrayList) {
			System.out.println(str);
		}
		Collections.sort(arrayList);
		System.out.println("After Sorting");
		for(String str:arrayList) {
			System.out.println(str);
		}
		
		
		//Creating arraylist of numbers
		System.out.println("ArrayList of Numbers :");
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    
	    
	    //LinkedList of Strings
	    LinkedList<String> cars=new LinkedList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    cars.addFirst("Maruti");
	    cars.addLast("Ferrari");
	    System.out.println(cars);
	}

}
