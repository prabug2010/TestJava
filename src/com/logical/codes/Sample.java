package com.logical.codes;

public class Sample {

	public static void main(String[] args) {

		int[] x = new int[] {12,15,16,20,11,18};
		int a = x[0];
		int b = x[0];
		for(int i=0; i<x.length; i++)
		{
			if(a<x[i])
			{
				b=a;
				a=x[i];
			}
			else if(b<x[i])
			{
				b=x[i];
			}
		}
		System.out.println("second max no is : "+b);
		System.out.println("first max no is : "+a);
	}

}
