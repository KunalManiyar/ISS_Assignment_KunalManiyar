package com.coreJava;

public class ThreadRunnableInterface {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Thread1 thread1=new Thread1();
		Thread2 thread2=new Thread2();
		
		Thread t1=new Thread(thread1);
		Thread t2=new Thread(thread2);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		
		System.out.println("Bye");


	}

}
class Thread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
		
	}
}

class Thread2 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}