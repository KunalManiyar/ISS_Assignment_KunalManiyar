package com.FileHandling;
import java.io.*;
import java.util.Scanner;

public class ReadAndWrite {
	public static void main(String[] args) {
		try {
			
		
			while(true) {
				System.out.println("1:Read\n2:Write\n3:Exit");
				System.out.print("Enter your choice : ");
				Scanner sc1=new Scanner(System.in);
			
				int ch=sc1.nextInt();
				if(ch==1) {
					//Read Operations
					BufferedReader in=new BufferedReader(new FileReader("sample.txt"));
					String myString;
					while((myString=in.readLine())!=null) {
						System.out.println(myString);
					}
					in.close();
				}else if(ch==2) {
					//Write Operations
					BufferedWriter out=new BufferedWriter(new FileWriter("sample.txt",true));
				
					System.out.print("Enter content to write : ");
					Scanner sc2=new Scanner(System.in);
					String content=sc2.nextLine();
					out.write(content+"\n");
					out.close();
				}else if(ch==3) {
					
					break;
				}else {
					System.out.println("Wrong Choice");
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
