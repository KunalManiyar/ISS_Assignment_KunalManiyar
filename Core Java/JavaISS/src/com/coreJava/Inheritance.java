package com.coreJava;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
        
        two obj=new two();//Single level inheritance
        obj.printHi();
        obj.printHello();
        
        three obj1=new three();//multilevel inheritance
        obj1.greet();
        obj1.printHello();
        obj1.printHi();
        
        _B objB=new _B();//hierarchical inheritance
        objB.print_A();
        objB.print_B();
        
        _C objC=new _C();
        objC.print_A();
        objC.print_C();
        
        
	}

}
class Bicycle {
    // the Bicycle class has two fields
    public int gear;
    public int speed;
 
    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}
 

class MountainBike extends Bicycle {

    public int seatHeight;
 

    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

class one{
	public void printHi() {
		System.out.println("Hi");
	}
}
class two extends one{
	public void printHello() {
		System.out.println("Hello");
	}
}

class three extends two{
	public void greet() {
		System.out.println("Good Morning");
	}
}

class _A {
    public void print_A() { System.out.println("Class A"); }
}
 
class _B extends _A {
    public void print_B() { System.out.println("Class B"); }
}
 
class _C extends _A {
    public void print_C() { System.out.println("Class C"); }
}
 
