package com.logical.codes;

public class FloydsTriangle {

	public static void main(String[] args) {

		int rows = 5;
		int count =0;
		for(int i=1; i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
				}
			System.out.println();
		}
	}

}
