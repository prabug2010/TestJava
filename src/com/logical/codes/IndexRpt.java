package com.logical.codes;

public class IndexRpt {

	public static void main(String[] args) {

		String s = "thinking";
		int n = s.length();
		int x=0, y=0;
		String temp = "";
		for(int i=0; i<n; i++)
		{
			char ch = s.charAt(i);
			x=s.indexOf(ch);
			y=s.lastIndexOf(ch);
			if(x==y)
			{
				temp+=ch;
			}
		}
		System.out.println(temp);
	}

}
