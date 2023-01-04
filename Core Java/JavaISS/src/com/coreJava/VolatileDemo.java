package com.coreJava;

public class VolatileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolatileData data=new VolatileData();
		Thread[] threads=new Thread[5];
		
		for(int i=0;i<5;i++) {
			threads[i]=new VolatileThread(data);
			threads[i].setName("Thread "+(i+1));
		}
		for(int i=0;i<5;i++) {
			threads[i].start();
		}

	}

}
class VolatileData{
	private volatile int counter=0;
	public int getCounter() {
		return counter;
	}
	public void increaseCounter() {
		++counter;
		
	}
}

class VolatileThread extends Thread{
	VolatileData data;
	VolatileThread(VolatileData data){
		this.data=data;
	}
	public void run() {
		int oldValue=data.getCounter();
		System.out.println(Thread.currentThread().getName()+" : Old Value : "+oldValue);
		data.increaseCounter();
		int newValue=data.getCounter();
		System.out.println(Thread.currentThread().getName()+" : New Value : "+newValue);
		
		
	}
}