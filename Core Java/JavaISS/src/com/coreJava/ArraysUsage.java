package com.coreJava;

public class ArraysUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		
		//Printing all elements of array
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		//Finding the largest element from the array
		int maxNum=num[0];
		for(int i=1;i<num.length;i++) {
			maxNum=(num[i]>maxNum)?num[i]:maxNum;
			
		}
		System.out.println("Largest Number "+maxNum);
		
		//Summing all the elements
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		System.out.println("Sum : "+sum);
		
		//For each loop
		for(int x:num) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Before reversing");
		//Passing array to method
		printElements(num);
		
		System.out.println();
		System.out.println("after reversing");
		//returning array from a method
		int[] result=reverseList(num);
		printElements(result);
		

	}
	static void printElements(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
	
	static int[] reverseList(int[] num) {
		int[] result=new int[num.length];
		int k=0;
		for(int i=num.length-1;i>=0;i--) {
			result[k++]=num[i];
		}
		return result;
	}

}
