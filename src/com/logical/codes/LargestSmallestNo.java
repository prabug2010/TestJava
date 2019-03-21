package com.logical.codes;

public class LargestSmallestNo {
	
	public static void main(String args[])
	{
		
	int[] x = new int[] {10,12,15,78,9,65};
	int large = x[0];
	int small = x[0];
	for(int i = 0; i<x.length; i++)
	{
		if(large<x[i])
		{
			large=x[i];
		}
		else if(small>x[i])
		{
			small=x[i];
		}
	}
	System.out.println("largest no is : "+large);
	System.out.println("smallest no is : "+small);
	}
}