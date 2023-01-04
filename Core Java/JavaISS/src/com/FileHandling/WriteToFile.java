package com.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedWriter out=new BufferedWriter(new FileWriter("sample.txt",true));) {
			//Write Operations
			System.out.print("Enter content to write : ");
			Scanner sc=new Scanner(System.in);
			String content=sc.nextLine();
			out.write(content+"\n");
			out.close();
			sc.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
