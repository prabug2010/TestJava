package com.javapractice2019;

public class PrimeNum {
	
	public static void prime(int x)
	{
		int n = x;
		boolean flag = true;
		for(int i=2; i<n/2; i++)
		{
			if((n%i)==0)
			{
				flag = false;
			}
		}
		if(flag)
			System.out.println("Number "+ n +"is a prime number");
	}

	public static void main(String[] args) {

		prime(11);
		prime(14);
	}

}
