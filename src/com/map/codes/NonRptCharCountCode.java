package com.map.codes;

import java.util.HashMap;
import java.util.Map;

public class NonRptCharCountCode {
	
	public static void repeatedCharCount(String str)
	{
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		String s =str;
		char[] ch = s.toCharArray();
		for(Character c : ch)
		{
			if(h1.containsKey(c))
			{
				h1.put(c, h1.get(c)+1);
			}
			else
			{
				h1.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : h1.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("The duplicate character is : " +e.getKey()+" & the count is : "+e.getValue());
				
			}
		}
		
	}
	
	public static Character repeatChar(String str)
	{
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		for(int i=0;i<str.length()-1; i++)
		{
			Character c = str.charAt(i);
			if(!hashmap.containsKey(c))
			{
				hashmap.put(c,1);
			}
			else
			{
				hashmap.put(c, hashmap.get(c)+1);
			}
		}
		for (Map.Entry<Character, Integer> e : hashmap.entrySet()) {
			   if (e.getValue() == 1)
			    return e.getKey();
		}
		return null;
	}
	public static void main(String[] args) {

		String str = "geekforgeeks";
		String st = "encyclopedia";
		repeatedCharCount(str);
	//	repeatedCharCount(st);
		System.out
	    .println("First non repeated character for String liril is : "
	      + repeatChar("liril"));
		
	}

}
