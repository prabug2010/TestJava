package com.java.abstractclass.code;

class AbstractClassCode {

	public static void main(String[] args) {
		
		A b = new B();
		b.run();
		b.walk();
		B c = new B();
		c.run();
		c.walk();
		c.run();
	}
}

abstract class A {
	void run()
	{
		System.out.println("A run");
	}
	void eat()
	{
		System.out.println("A eat");
	}
	abstract void walk();
}

class B extends A
{
	void run()
	{
		System.out.println("B run");
	}
	
	void eating()
	{
		System.out.println("B eat");
	}
	
	void walk()
	{
		System.out.println("B walk");
	}
}