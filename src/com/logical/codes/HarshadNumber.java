package com.logical.codes;

public class HarshadNumber {

	public static void main(String[] args) {

		int n = 152;
		int temp =n;
		int sum=0;
		while(n>0)
		{
			sum= sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);
		if(temp%sum==0)
		{
			System.out.println("The given number is a harshad number ");
		}
		else
			System.out.println("Number is not Harshad number");
	}

}
