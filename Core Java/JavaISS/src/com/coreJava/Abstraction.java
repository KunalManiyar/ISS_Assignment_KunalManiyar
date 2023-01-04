package com.coreJava;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle("Red", 2.2);
        System.out.println(s1);
        
        Outer outer=new Outer();
        Outer.Inner obj1=outer.new Inner();
        obj1.myAbstractMethod();
	}

}
abstract class Shape{
	String color;
	public abstract double area();
	public abstract String toString();
	public Shape(String color) {
		this.color=color;
		
		System.out.println("Shape constructor called");
	}
}

class Circle extends Shape{
	double radius;
	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius=radius;
	}
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	public String toString() {
		return "Circle color is "+color+" and area is "+area();
	}
}

abstract class OuterClass {
    // declaring inner class as abstract with abstract
    // method
    abstract class InnerClass {
        abstract void myAbstractMethod();
    }
}
class Outer extends OuterClass {
    class Inner extends InnerClass {
        // implementing the abstract method
        void myAbstractMethod()
        {
            System.out.println(
                "Inside abstract method implementation");
        }
    }
}