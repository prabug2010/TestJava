package com.logical.codes;

public class Fibanocci {
	
	public static void fibanocci(int number)
	{
		int a=0, b=1, c=0;
		int n = number;
		for(int i =0; i<n; i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("The fibanocci series for given number is : "+c);
	}

	public static void main(String[] args) {
		int number = 8;
		fibanocci(number);

	}

}
