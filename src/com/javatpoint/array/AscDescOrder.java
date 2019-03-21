package com.javatpoint.array;

public class AscDescOrder {
	
	public void asc()
	{
		int[] x = {1,4,5,7,3};
		int temp =0;
		for(int i=0; i<x.length; i++)
		{
			for(int j=i; j<x.length; j++)
			{
				if(x[i]>x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j]=temp;
				}
			}
		}
		
		for(int k=0; k<x.length; k++)
		{
			System.out.println("The sorted ascending order array is : "+x[k]);
		}
	}

	public void desc()
	{
		int[] x = {1,4,5,7,3};
		int temp =0;
		for(int i=0; i<x.length; i++)
		{
			for(int j=i; j<x.length; j++)
			{
				if(x[i]<x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j]=temp;
				}
			}
		}
		
		for(int k=0; k<x.length; k++)
		{
			System.out.println("The sorted descending order array is : "+x[k]);
		}
	}
	
	public static void main(String[] args) {

		AscDescOrder ascdesc = new AscDescOrder();
		ascdesc.asc();
		ascdesc.desc();
	}

}
