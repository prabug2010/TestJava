package com.logical.codes;

public class ArmstrongNumber {
	
	public static void armstrong(int number)
	{
		int a, b=0;
		int temp = number;
		while(number>0)
		{
			a=number%10;
			number=number/10;
			b=b+(a*a*a);
		}
		
		if(temp==b)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		int n = 151;
		armstrong(n);
	}

}
