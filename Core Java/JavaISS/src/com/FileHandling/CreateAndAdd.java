package com.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class CreateAndAdd {
 
    public static void main(String[] args)
    {
    	System.out.print("Enter friend's name : ");
    	Scanner sc=new Scanner(System.in);
    	String friendsName=sc.nextLine();
    	try {
    	      File myObj = new File("friendsList.txt");
    	      if (myObj.createNewFile()) {
    	        System.out.println("File created: " + myObj.getName());
    	      } else {
    	        System.out.println("File already exists.");
    	      }
    	      BufferedWriter out=new BufferedWriter( new FileWriter("friendsList.txt",true));
    	      BufferedReader in=new BufferedReader(new FileReader("friendsList.txt"));
    	   
    	      boolean found=false;
    	      String currFriend;
    	      while((currFriend=in.readLine())!=null) {
    	    	  if(currFriend.equals(friendsName)) {
    	    		  found=true;
    	    		  break;
    	    	  }
    	   
    	      }
    
    	      if(found) {
    	    	  System.out.println("Friend already in the list");
    	      }else {
    	    	  out.write(friendsName+"\n");
    	    	  System.out.println("Friend Added");
    	      }
    	     
    	      out.close();
    	      sc.close();
    	      
    	      
    	    } catch (IOException e) {
    	      System.out.println("An error occurred.");
    	      e.printStackTrace();
    	    }
    
        
    }
}