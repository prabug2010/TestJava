package com.logical.codes;

public class SumOfAllDigits {

	
	public static void sumOfAllDigits(int number)
	{
		int a, b=0;
		while(number>0)
		{
			a=number%10;
			number=number/10;
			b=b+a;
		}
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		sumOfAllDigits(777);
		sumOfAllDigits(888);
		sumOfAllDigits(999);
		
	}

}
