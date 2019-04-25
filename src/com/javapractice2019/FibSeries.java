package com.javapractice2019;

import java.util.Arrays;

public class FibSeries {
	
	public static void fibSeries()
	{
		int n = 120, result=0;
		int copy =n;
		while(n>0)
		{
			result = result+(n%10);
			n=n/10;
		}
		if(copy%result==0)
		{
			System.out.println("Given number is harshad number");
		}
		else
			System.out.println("Given number is  nt harshad number");
	
	}

	public static void main(String[] args) {
		fibSeries();
		
	}

}
