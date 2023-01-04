package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedReader in=new BufferedReader(new FileReader("sample.txt"));){
			//Read Operations
			
			String myString;
			while((myString=in.readLine())!=null) {
				System.out.println(myString);
			}
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
