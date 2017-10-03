package com.logical.codes;

public class PairsInArray {
	
	public static void pairsArray(int[] s, int num)
	{
		int[] z = s;
		int x = num;
		int n = z.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(z[i]+z[j]==x)
				{
					System.out.println("The given number is produced by pairs : "+z[i]+"&"+z[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		pairsArray(new int[] {12,5,10,7,13,6,4,1,14}, 17);
	}

}
