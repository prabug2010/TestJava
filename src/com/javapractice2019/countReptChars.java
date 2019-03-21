package com.javapractice2019;

import java.util.HashMap;
import java.util.Map;

public class countReptChars {

	public static void repChars(String s)
	{
		char[] c1 = s.toCharArray();				
	HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); i++)
		{
			Character c = s.charAt(i);
			if(h1.containsKey(c))
			{
				h1.put(c, h1.get(c)+1);
			}
			else
				h1.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : h1.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.print(entry.getKey());
			}
			else if(entry.getValue()>=1)
				System.out.print(String.valueOf(entry.getKey())+entry.getValue());
				
				
		}
	}
	public static void main(String[] args) {
		repChars("ABBCDDDEFGGH");
	}

}
