package com.pattern.codes;

public class InvertedNumberPyramid {

	public static void main(String[] args) {
		int n=1;
		 int i, j, k;
			for(i=5;i>=1;i--)
			{
			for(j=5;j>=i;j--)
			{
			System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
			System.out.print(k+" ");
			
			}
			System.out.println();
			}
	}

}
