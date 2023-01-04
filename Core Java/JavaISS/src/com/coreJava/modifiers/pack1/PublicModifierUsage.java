package com.coreJava.modifiers.pack1;
import com.coreJava.modifiers.pack2.Test1;
public class PublicModifierUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 obj=new Test1(10,20);
		obj.printSum();// public method printSum() of Test1 class from another package is accessible
//		System.out.println(obj.num1); //Not accessible, num1 variable is default type so accessible only from within the package

	}

}

