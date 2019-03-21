package com.javapractice2019;

public class SpacePreserve {
	
	public static void space(String s)
	{
		char[] c1 = s.toCharArray();
		char[] c2 = new char[c1.length];
		int j = c1.length-1;
		
		for(int i=0; i<c1.length; i++)
		{
			if(c1[i]==' ')
			{
				c2[i] = ' ';
			}
		}
		
		for(int i=0; i<c1.length; i++)
		{
			if(c1[i]!=' ')
			{
				if(c2[j]==' ')
				{
					j--;
				}
				c2[j] = c1[i];
				j--;
			}
			
			
		}
		
		System.out.print(String.valueOf(c2));
	}

	public static void main(String[] args) {

		
		space("I am a tester");
	}

}
