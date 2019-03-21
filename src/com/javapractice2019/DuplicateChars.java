package com.javapractice2019;

public class DuplicateChars {
	
	public void stringDups()
	{
		String dup = "liril";
		int count=0;
		for(int i=0; i<dup.length(); i++)
		{
			char c = dup.charAt(i);
			for(int j=i; j<dup.length(); j++)
			{
				char x = dup.charAt(j);
				if(c==x)
				{
					count = count+1;
				}
			}
			if(count>1)
			{
				System.out.println("The duplicate characters in string are : "+c+" and it occured "+count+" times");
			}
			count =0;
		}
	}
	
	public static void main(String[] args)
	{
		DuplicateChars dups = new DuplicateChars();
		dups.stringDups();
	}


	}


