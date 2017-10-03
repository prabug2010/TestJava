package com.logical.codes;

public class FibanocciCode {
	public static void main(String[] args) {
		int[] x = new int[] {0,1,2,3,4,5,6,7,8,9,13,15,21,22,34,44,55,56,58,89,92,99,144};
		int n1 = 0;
		int n2 = 1;
		try {
			for(int i=0; i<x.length; i++)
			{
				if(x[i]<100)
				{
				int current = n1 + n2;
				System.out.print(x[current] + " ");
				n1=n2;
				n2=current;
				}
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			// do nothing
		}
		System.out.println("Done");
	}
}