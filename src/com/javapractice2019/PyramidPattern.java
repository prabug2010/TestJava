package com.javapractice2019;

public class PyramidPattern {
	
	public static void pattern(int num)
	{
		int n = num;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		pattern(7);
	}

}
