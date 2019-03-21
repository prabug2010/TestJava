package com.javapractice2019;

public class ContReptArrayElm {
	
	public static void contReptArray()
	{
		String s = "sr12333a12c4dddd45677hr";
		char[] c = s.toCharArray();
		String temp ="";
		for(int i=1; i<c.length;i++)
		{
			if(c[i]==c[i-1])
			{
				temp = temp+c[i];	
			}
		}
		
		System.out.print(temp);
	}

	public static void main(String[] args) {
		contReptArray();
	}

}
