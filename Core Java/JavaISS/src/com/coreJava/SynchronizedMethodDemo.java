package com.coreJava;

public class SynchronizedMethodDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Counter c=new Counter();
		
		
		Thread th1=new Thread(new Runnable() 
		{
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
		});
		Thread th2=new Thread(new Runnable() 
		{
			public void run() {
				for(int i=1;i<=1000;i++) {
					c.increment();
				}
			}
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("Count : "+c.count);
	}

}
class Counter{
	int count=0;
	public synchronized void increment() {
		count++;
	}
}