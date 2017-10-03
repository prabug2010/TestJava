package com.string.codes;

public class VowelsInString {

	public static void main(String[] args) {
		String str = "EncycloPedIA";
		str = str.toLowerCase();
		int n = str.length();
		int count = 0;
		for(int i=0; i<n; i++)
		{
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println("the vowels are : "+c);
				count++;
				
			}
		}
		System.out.println("no of vowles in string : "+count);
	}

}
