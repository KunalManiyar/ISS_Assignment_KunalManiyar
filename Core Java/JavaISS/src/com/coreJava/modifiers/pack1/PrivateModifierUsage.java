package com.coreJava.modifiers.pack1;

public class PrivateModifierUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj=new Test(3);
//		System.out.println(obj.num);//shows message that num is not visible
	}

}

class Test{
	private int num;//private variable could be accesses only within the class
	public Test(int num) {
		this.num=num;
	}
	
}
