package com.javapractice2019;

public class Armstrong {

	public static void  arm(int num)
	{
		int n = num;
		int c =num;
		int result=0, b=0;
		while(n>0)
		{
			b = n%10;
			result = result+(b*b*b);
			n=n/10;
		}
		System.out.println(result);
		if(result==c)
		System.out.println("Number is armstrong number");
		else
		System.out.println("Number is not armstrong");
	}
	public static void main(String[] args) {
		arm(153);
	}

}
