package com.coreJava;

public class Interfaces implements In1 {

	// Implementing the capabilities of
    // interface.
    public void display(){
      System.out.println("Kunal");
    }

    // Driver Code
    public static void main(String[] args)
    {
    	Interfaces t = new Interfaces();
        t.display();
        t.greet();
        System.out.println(a);
        
        
        Sample obj=new Sample();//Extending interfaces
        obj.method1();
        obj.method2();
        obj.method3();
        
        Sample1 obj1=new Sample1();//Implementing multiple interfaces
        obj1.method1();
        obj1.method2();
        obj1.method4();
        
        Test.Yes test=new Testing();
        test.show();
  //      test.display();//not accessible because of upcasting
    }

}
interface In1 {
	   
    // public, static and final
    final int a = 10;
 
    // public and abstract
    void display();
    
    default void greet() {
    	System.out.println("Hello Kunal");
    }
}



interface InA{
    void method1();
      void method2();
}
interface InC{
	void method4();
}
// InB now includes method1 and method2
interface InB extends InA{
      void method3();
}
//Extending Interfaces
//the class must implement all method of InA and InB.

class Sample implements InB{
      public void method1(){
    System.out.println("Method 1");
    }
      public void method2(){
    System.out.println("Method 2");
    }
      public void method3(){
    System.out.println("Method 3");
    }
}

//Implementing multiple interfaces
class Sample1 implements InA,InC{
	  public void method1(){
		    System.out.println("Method 1");
	  }
      public void method2(){
		    System.out.println("Method 2");
      }
      public void method4(){
		    System.out.println("Method 4");
    }
}


class Test
{
    interface Yes
    {
        void show();
    }
}
  
class Testing implements Test.Yes
{
    public void show()
    {
        System.out.println("show() method of interface");
    }
    public void display() {
    	System.out.println("Hello world");
    }
}