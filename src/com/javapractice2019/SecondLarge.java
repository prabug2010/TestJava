package com.javapractice2019;

public class SecondLarge {
	
	public static void secLarge()
	{
		int[] num = {10, 21, 20, 17, 18, 15, 28};
		int firstMax = 0;
		int secondMax = 0;
		for(int i=0; i<num.length; i++)
		{
			if(num[i]>firstMax)
			{
				secondMax = firstMax;
				firstMax = num[i];
			}
			else if(num[i]>secondMax)
				secondMax = num[i];
		}
		
		System.out.println("The second max number is : "+secondMax);
		
	}

	public static void main(String[] args) {

		secLarge();
	}

}
