package com.logical.codes;

public class LeadersInArray {
	
	public static void leaders()
	{
		int[] x = new int[] {17,12,15,4,5,1,9,3};
		int n = x.length;
		int max = x[n-1];
		System.out.println(x[n-1]);
		for(int i=n-2; i>=0; i--)
		{
			if(x[i]>max)
			{
				System.out.println(x[i]);
				max=x[i];
			}
		}
	}

	public static void main(String[] args) {
			leaders();
	}
}