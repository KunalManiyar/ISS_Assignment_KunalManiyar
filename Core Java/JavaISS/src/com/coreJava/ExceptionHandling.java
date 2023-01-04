package com.coreJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling {

	 public static void main (String[] args) {
//	      int a=5;
//	      int b=0;
//	        try{
//	          System.out.println(a/b);
//	        }
//	      catch(ArithmeticException e){
////	    	  e.printStackTrace();//This method prints exception information in the format of Name of the exception: description of the exception, stack
//	    	  System.out.println(e.toString());//This method prints exception information in the format of Name of the exception: description of the exception.
//	    	  System.out.println(e.getMessage());//This method prints only the description of the exception
//	      }
	        
	        
	        
	        int i=8,j,k=0;
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        try {
	        	System.out.print("Enter a number : ");
	        	j=Integer.parseInt(br.readLine());
	        	k=i/j;
	        	 System.out.println("Output is "+k);
			}
	        catch(IOException e)//Checked Exception
	        {
	        	System.out.println("IO Error");
	        }
	        catch(ArithmeticException e)//Unchecked Exception 
	        {
	        	System.out.println("Cannot Divide by zero");
	        }
	        catch (Exception e) {
				// TODO: handle exception
	        	System.out.println("Some other error");
			}
	        finally {
	    
	        	System.out.println("Finally Bye");
	        }
	        
	        
	        
	        
	        
	        
	        
	       
	    }
}
