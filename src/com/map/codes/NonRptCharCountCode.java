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
	public static void main(String[] args) {

		String str = "geekforgeeks";
		String st = "encyclopedia";
		repeatedCharCount(str);
	//	repeatedCharCount(st);
	}

}
