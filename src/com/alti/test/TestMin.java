package com.alti.test;

public class TestMin {
	
	public void twoMin(int[] number)
	{
		int a = number[0];
		int b =number[0];
		int n =number.length;
		for(int i=0; i<n; i++)
		{
			if(number[i]<a)
			{
				a=number[i];
			}
		}
		
		for(int j=0; j<n; j++)
		{
			if(number[j]<b&&number[j]!=a)
			{
				b=number[j];
			}
		}
		System.out.println("The first min no is : "+a);
		System.out.println("The second min no is : "+b);
	}

	public static void main(String[] args) {
		int[] num = new int[] {12,10,25,38,90,72,65};
		TestMin test = new TestMin();
		test.twoMin(num);
	}

}
