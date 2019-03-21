package com.javapractice2019;

public class StringSwap {
	
	public static void swap(String s1, String s2)
	{
		String str1 = s1;
		String str2 = s2;
		s1 = s1+s2;
		s2 =s1.substring(0, (s1.length()-s2.length()));
		s1=s1.substring(s2.length());
		
		System.out.println("After swapping : "+s1+" & "+s2);
	}

	public static void main(String[] args) {
		swap("java","python");
	}

}
