package com.coreJava;

public class StringsUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname="Kunal";//Strings are immutable
		String lname="Maniyar";
		String fullName=fname.concat(lname);
		System.out.println(fullName);
		
		
		char[] myNameArray= {'K','u','n','a','l'};
		String myName=new String(myNameArray);
		System.out.println(myName);
		
		System.out.println("String length is "+myName.length());//Prints the length of the string
		
		//Creating format strings
		System.out.printf("My first name is %s and last name is %s",fname,lname);
		System.out.println();
		System.out.println("Character at index 3 is "+fullName.charAt(3));
		
		
		String a="Kunal";
		String b="Kunal";
		System.out.println(a==b);// because java creates same constant for same literal and is called as string literal pool
		
		String a1=new String("Kunal");
		String b1=new String("Kunal");
		System.out.println(a1==b1);// because it represents two different objects
		
		
		StringBuffer str=new StringBuffer("Kunal");//strings created using StringBuffer are mutable
		str.append("Maniyar");
		System.out.println(str);
		
		System.out.println(a.equals(a1));//compares the content of the string
		System.out.println(a1.equals(b1));

	}

}
