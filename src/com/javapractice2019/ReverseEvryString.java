package com.javapractice2019;

public class ReverseEvryString {
	
	public static void reverseWords(String s)
	{
		String str = s;
		String[] s1 = s.split(" ");
		String s4 = "";
		int n = s1.length;
		
		for(int i=0; i<n; i++)
		{
			String s2 = s1[i];
			String s3 = "";
			for(int j=s2.length()-1; j>=0; j--)
			{
				s3= s3+s2.charAt(j);
			}
			s4 = s4+s3+" "; 
		}
		System.out.println(s4);
		
		
	}

	public static void main(String[] args) {
		reverseWords("Java Program for the day");
	}

}
