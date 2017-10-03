package com.java.abstractclass.code;

class AbstractClassCode {

	public static void main(String[] args) {
		
		A b = new B();
		b.run();
		b.walk();
		B c = new B();
		c.run();
		c.walk();
	}
}

abstract class A {
	void run()
	{
		System.out.println("A run");
	}
	abstract void walk();
}

class B extends A
{
	void run()
	{
		super.run();
		System.out.println("B run");
	}
	
	void walk()
	{
		System.out.println("B walk");
	}
}