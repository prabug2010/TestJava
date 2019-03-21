package com.javapractice2019;

public class FloydNumbers {

	public static void floydNumbers()
	{
		int n =5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i +" ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		
		floydNumbers();

	}

}
