package com.javapractice2019;

public class ArmstrongNumber {

	public static boolean armstrong(int num)
	{
		int n = num;
		int b, result = 0;
		int a = num;
		while(n>0)
		{
			b = n%10;
			result = result+(b*b*b);
			n = n/10;
			
		}
		if(a==result)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {

		if(armstrong(152))
			System.out.println("The number is armstrong number");
		else
			System.out.println("The number is not armstrong number");
	}

}
