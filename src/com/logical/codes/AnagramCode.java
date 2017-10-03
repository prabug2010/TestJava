package com.logical.codes;

import java.util.Arrays;

public class AnagramCode {
	
	public static boolean anagram(String s1, String s2)
	{
		String first = s1;
		String second = s2;
		if(first.length()!=second.length())
		{
		return false;
	}
		char[] ch = first.toCharArray();
		char[] cr = second.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(cr);
		
		return Arrays.equals(ch, cr);

}
	public static void main(String args[])
	{
		String s = "keep";
		String x = "peek";
		boolean result = anagram(s,x);
		System.out.println(result);
	}
}
