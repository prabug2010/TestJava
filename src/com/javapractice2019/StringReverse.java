package com.javapractice2019;

public class StringReverse {
	
	public void iterative()
	{
		String s = "made";
		char[] c = s.toCharArray();
		for(int i=c.length-1; i>=0 ;i--)
		{
			System.out.print(c[i]);
		}
	}

	
	public static void main(String[] args) {
		
		StringReverse ob = new StringReverse();
		ob.iterative();
	}

}
