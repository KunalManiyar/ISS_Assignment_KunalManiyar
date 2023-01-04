package com.coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionThrowThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionThrowThrowsDemo obj=new ExceptionThrowThrowsDemo();
		try {
			int num=obj.A();
			if(num<=10) {
				throw new ArithmeticException("Number should be greater than 10");
				}// Throwing ArithmeticException Explicitly			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int A() throws Exception {//Using throws we can avoid exception handling and pass it to the caller function
		return B();
	}
	public int B() throws Exception{
		System.out.print("Enter a number : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		return num;
	}

}
