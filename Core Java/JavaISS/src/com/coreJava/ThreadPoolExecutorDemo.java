package com.coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runnable t1=new Task("Task 1");
		Runnable t2=new Task("Task 2");
		Runnable t3=new Task("Task 3");
		Runnable t4=new Task("Task 4");
		Runnable t5=new Task("Task 5");
		
		ExecutorService pool=Executors.newFixedThreadPool(3);
		
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		
		pool.shutdown();
	}

}

class Task implements Runnable   
{
    private String name;
      
    public Task(String s)
    {
        name = s;
    }
      
    public void run()
    {
        try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Initialization Time for"
                            + " task name - "+ name +" = " +ft.format(d));   
                    //prints the initialization time for every task 
                }
                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Executing Time for task name - "+
                            name +" = " +ft.format(d));   
                    // prints the execution time for every task 
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" complete");
        }
          
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}