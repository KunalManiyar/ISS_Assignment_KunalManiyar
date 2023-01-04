package com.coreJava;

public class LoopControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
	//		while (test_expression)
	//		{
	//		   // statements
	//		 
	//		  update_expression;
	//		}
	     int i=0;
	      while (i<=10)
	      {
	        System.out.println(i);
	        i++;
	      }
	      
//	      for (initialization expr; test expr; update exp)
//	      {
//	           // body of the loop
//	           // statements we want to execute
//	      }
	      //For loop
	      for (i=0;i<=10;i++)
	       {
	         System.out.println(i);
	       }
	      
	      
	     //do-while loop
//	      do
//	      {
//	          // Loop Body
//	          Update_expression
//	      }
//
//	      // Condition check
//	      while (test_expression);
	      int j=0;
	      do
	      {
	        System.out.println(i);
	        j++;
	      }while(j<=10);
	      
	      
	      String fruits[] = { "Apple", "Banana", "Grapes" };
	      
	        // enhanced for loop
	        for (String x : fruits) {
	            System.out.println(x);
	        }
	        
	        for(int k=0;k<fruits.length;k++) {
	        	System.out.println(fruits[k]);
	        }
	    }	

}
