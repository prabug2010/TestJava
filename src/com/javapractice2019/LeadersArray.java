package com.javapractice2019;

public class LeadersArray {
	public static void leader(int[] num)
	{
		int[] n = num;
		int[] leader = new int[n.length];
		int last = n[n.length-1];
		for(int i=n.length-2; i>=0; i--)
		{
		if(n[i]>last)
		{
			last = n[i];
		}
		}
		
		for()
	}

	public static void main(String[] args) {

	}

}
