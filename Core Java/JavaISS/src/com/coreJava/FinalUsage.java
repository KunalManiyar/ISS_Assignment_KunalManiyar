package com.coreJava;

public class FinalUsage {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num=3;//initializing final variable at the time of declaration
//		num=4;//cannot be reassigned,gives error
		
		final int num1;
		num1=4;// can be initialized after its declaration	
	}
}

class A{
	static final int num;
	static {
		num=2;// can be initialized using a static block
	}
}

class B{
	public final void sum(int a,int b) {
		System.out.println("Sum : "+(a+b));
	} 
}
final class C extends B{
//	public void sum(int a,int b) {// method can't be overridden as it is declared as final
//		System.out.println("Sum : "+(a+b));
//	}
}

//class D extends C{// cannot be a subclass of class C as it is declared as final
//	
//}
