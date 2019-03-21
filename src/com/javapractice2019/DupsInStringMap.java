package com.javapractice2019;

import java.util.HashMap;
import java.util.Map;

public class DupsInStringMap {
	
	public static Character dups(String s)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer> ();
		String str = s;
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			Character c = s.charAt(i);
			if(!hm.containsKey(c))
				hm.put(c, 1);
			else if(c!=32)
				hm.put(c, hm.get(c)+1);				
		}
		for(Map.Entry<Character, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()==1)
				return entry.getKey();
		}
		
		return null;
	}

	public static void main(String[] args) {
System.out.println("The first non repeated character is : "+dups("Better Butter"));
	}

}
