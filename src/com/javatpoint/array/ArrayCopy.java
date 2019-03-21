package com.javatpoint.array;

public class ArrayCopy {
	
	public void arrayCopy()
	{
	int[] x = {1,3,5,7,9};
	int[] y = new int [x.length];
	
	for(int i=0; i<x.length; i++)
	{
		y[i]=x[i];
	}
	
	for(int i=0; i<x.length; i++)
	{
		System.out.print(y[i]+" ");
	}

	
	}

	public static void main(String[] args) 
	{
		ArrayCopy ac = new ArrayCopy();
		ac.arrayCopy();
	}

}
