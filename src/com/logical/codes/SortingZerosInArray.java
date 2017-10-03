package com.logical.codes;

import java.util.Arrays;

public class SortingZerosInArray {
	
	public static void zerosToFront()
	{
		int[] a = new int[] {4,5,0,2,0,8,0};
		int n = a.length;
		int count=n-1;
		for(int i=n-1; i>=0;i--)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count--;
			}
		}
		
		while(count>=0)
		{
			a[count]=0;
			count--;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void zerosToEnd()
	{
		int[] a = new int[] {4,5,0,2,0,8,0};
		int n = a.length;
		int count=0;
		for(int i=0; i<n;i++)
		{
			if(a[i]!=0)
			{
				a[count]=a[i];
				count++;
			}
		}
		
		while(count<n)
		{
			a[count]=0;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		zerosToEnd();
		zerosToFront();
		
	}

}
