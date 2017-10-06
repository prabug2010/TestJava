package com.logical.codes;

public class TwoMaxNumbers {

	public static void main(String[] args) {

		int[] a = new int[] {12,14,15,17,20,11};
		int n = a.length;
		int max1 =a[0];
		int max2 =a[0];
		for(int i=0;i<n; i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("The first max no is : "+max1);
		System.out.println("The second max no is : "+max2);
	}

}
