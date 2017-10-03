package com.arrays.code;

public class ArraySort {
	
	public static void main(String args[])
	{
		int [] n = new int[] {4,6,2,3,1,0};
		int temp = 0;
		for(int i = 0; i<n.length; i++)
		{
			for(int j=0; j<n.length;j++)
			{
				if(n[i]<n[j])
				{
					temp = n[j];
					n[j]=n[i];
					n[i]=temp;
				}
			}
		}
		for(int x = 0; x<n.length;x++)
		{
			System.out.println(n[x]);
		}
	}

}
