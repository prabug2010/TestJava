package com.javapractice2019;

public class ReverseNum {
	
	public static void revNum()
	{
		int i = 678, j,k = 0;
		int n= i;
		
		while(i>0)
		{
			j=(i%10);
			k=(k*10)+j;
			i=i/10;
		}
		
		System.out.println("The reversed number is : "+k);
	}

	public static void main(String[] args) {

		revNum();
	}

}
