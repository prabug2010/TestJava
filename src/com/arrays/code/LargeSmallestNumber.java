package com.arrays.code;

public class LargeSmallestNumber {

	public static void main(String[] args) {

		int[] a = new int[] {1,5,7,3,8,9};
		int large = a[0];
		int small = a[0];
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>large)
			{
				large=a[i];
			}
			if(a[i]< small)
			{
				small=a[i];
			}
		}
		
		System.out.println("largest no : "+large);
		System.out.println("smallest no : "+small);
	}

}
