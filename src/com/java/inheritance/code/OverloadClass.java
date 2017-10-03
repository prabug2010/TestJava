package com.java.inheritance.code;

public class OverloadClass {
	
	void m1(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	void m1(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	void m3(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	void m2(int a, long b)
	{
		System.out.println("d");
	}
	
	void m2(long a, int b)
	{
		System.out.println("cc");
	}
	
	public static void main(String args[])
	{
		OverloadClass o = new OverloadClass();
		o.m1(15, 15);
		o.m1(10, 7);
		o.m2(20l, 20);
	}
}