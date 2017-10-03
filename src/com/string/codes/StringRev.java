package com.string.codes;

public class StringRev {

	public static void main(String args[])
	{
		String s = "My name is XXX";
		int n =s.length();
		for(int i = n-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
