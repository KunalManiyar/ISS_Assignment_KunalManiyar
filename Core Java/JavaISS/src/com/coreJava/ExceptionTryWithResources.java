package com.coreJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionTryWithResources {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {//try with resources
			String str="";
			
			str=br.readLine();
		} 

	}

}
