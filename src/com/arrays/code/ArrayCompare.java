package com.arrays.code;

public class ArrayCompare {
	
	public static void arrayComp()
	{
		int[] a = new int[] {24,25,26,27};
		int[] b = new int[] {26,25,27,28};
		int[] c = new int[a.length+b.length];
		int n = a.length;
		for(int x=0; x<n; x++)
		{
			c[x]=a[x];
		}
		
		int count = n;
		for(int i = 0; i<n; i++)
		{
			boolean add = true;
			for(int j=0; j<n; j++)
			{
				if(a[i]==b[j])
				{
					add=false;
				}
			}
			if(add)
			{
				c[count]=b[i];
				count=count+1;
			}
		}
		for(int y = 0; y<c.length; y++)
		{
			System.out.println(c[y]);
		}
	}

	public static void main(String[] args) {
	
		arrayComp();
	}

}
