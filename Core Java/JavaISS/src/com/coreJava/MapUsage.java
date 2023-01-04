package com.coreJava;

import java.util.HashMap;
import java.util.Map;

public class MapUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> states=new HashMap<>();
		
		states.put(1,"Maharashtra");
		states.put(2, "Rajasthan");
		states.put(3, "Kolkata");
		states.put(4, "Uttar Pradesh");
		
		System.out.println(states);
		
		//Accessing an item
		System.out.println(states.get(1));
		
		// Print keys
		for (Integer i : states.keySet()) {
		  System.out.println(i);
		}
		
		// Print values
		for (String i : states.values()) {
		  System.out.println(i);
		}
		
		//Print Key value Pair
		for(Map.Entry<Integer,String> mp:states.entrySet()) {
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
		
	}

}
