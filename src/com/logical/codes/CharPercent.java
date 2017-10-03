package com.logical.codes;

public class CharPercent {

	public static void main(String[] args) {

		String s = "1223EncyCLoPedia@#!";
		int n =s.length();
		int digit=0;
		int upp = 0;
		int low = 0;
		int others = 0;
		for(int i=0; i<n; i++)
		{
			Character ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			upp++;
			else if(Character.isLowerCase(ch))
				low++;
			else if(Character.isDigit(ch))
				digit++;
			else
				others++;
		}
		double upp_percent = (upp*100.0)/n;
		double low_percent = (low*100.0)/n;
		double digit_percent = (digit*100.0)/n;
		double other_percent = (others*100.0)/n;
		
		System.out.println("for the given string : "+s);
		System.out.println("upper case percent is : "+upp_percent);
		System.out.println("upper case percent is : "+digit_percent);
		System.out.println("digits percent is : "+low_percent);
		System.out.println("others percent is : "+other_percent);
	}

}
