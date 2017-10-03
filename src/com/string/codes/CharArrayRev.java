package com.string.codes;

public class CharArrayRev {
	
	public static void main(String args[])
	
	{
		String s = "london";
		char[] c = s.toCharArray();
		int n = c.length;
		for(int i=n-1; i>=0; i--)
		{
			System.out.print(c[i]);
		}
	}

}
