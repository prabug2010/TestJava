package com.javapractice2019;

public class FibanocciSeries {

	public static void fib()
	{
		int a =1;
		int b=1;
		int[] c = new int[8
		                  ];
		c[0]=a;
		c[1]=b;
		for(int i=2; i<c.length; i++)
		{
			c[i] = a+b;
			a=b;
			b=c[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ,");	
		}
		
	}
	public static void main(String[] args) {

		fib();
	}

}
