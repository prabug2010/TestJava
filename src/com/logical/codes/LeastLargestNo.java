package com.logical.codes;

public class LeastLargestNo {

	public static int leastLargeNum(int num, int n)
	{
		char a = Integer.toString(n).charAt(0);
		for(int i=num; i>0; i--)
		{
			if(Integer.toString(i).indexOf(a)==-1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(leastLargeNum(123,2));
		
	}
}
