package com.string.codes;

public class CaseOfChar {
	
	public void charCase()
	{
		String s = "Am an Indian";
		int n = s.length();
		for (int i =0; i<n; i++)
		{
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				System.out.println("given character "+ch+" is uppercase");
				
			}
			else if(Character.isLowerCase(ch))
			{
				System.out.println("given character "+ch+" is lowercase");
			}
		}
	}

	public static void main(String[] args) {
		CaseOfChar casechar = new CaseOfChar();
		casechar.charCase();
	}

}
