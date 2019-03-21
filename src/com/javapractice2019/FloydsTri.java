package com.javapractice2019;

public class FloydsTri {
	
	public static void floyd(int num)
	{
		int k=1;
		int n = num;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k++ +" ");
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {

		floyd(5);
	}

}
