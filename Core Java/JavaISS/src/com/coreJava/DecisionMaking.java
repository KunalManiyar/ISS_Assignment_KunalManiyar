package com.coreJava;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		 
        if (i < 15)
            System.out.println("Inside If block");
            System.out.println("10 is less than 15");// This statement will be executed as if considers one statement by default

            
        i = 10;
        
        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
        
        
        
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement will only be executed if statement above it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }
        
        
        i = 20;
        
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
        
        
        
        System.out.println();
        for (i = 0; i < 10; i++) {
            // If the number is odd skip and continue
            if (i % 2 != 0)
                continue;
 
            // If number is even, print it
            System.out.print(i + " ");
        }
        
        System.out.println();
        int day=3;
        switch(day) {
        case 0:
    		System.out.println("Sunday");
    		break;
        case 1:
    		System.out.println("Monday");
    		break;
        case 2:
    		System.out.println("Tuesday");
    		break;
        case 3:
    		System.out.println("Wednesday");
    		break;
        case 4:
    		System.out.println("Thursday");
    		break;
        case 5:
    		System.out.println("Friday");
    		break;
        case 6:
    		System.out.println("Saturday");
    		break;
    	default:
    		System.out.println("No such day");
        }
        	
	}

}
