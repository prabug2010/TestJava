package com.set.codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetCode {
	
	public static void main(String args[])
	{
		HashSet<Integer> s = new HashSet<Integer> ();
		s.add(0);
		s.add(5);
		s.add(3);
		s.add(1);
		s.add(2);
		System.out.println(s);
		Integer[] n = s.toArray(new Integer[s.size()]);
	//	System.out.println(s);
		for(Integer x : n)
		{
			System.out.println(x);
		}
		
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(n));
		s2.add(7);
		System.out.println(s2);
		for(Integer y : s2)
		{
			System.out.println(s.contains(y)? "yes" : "No");
	}
		Set<Integer> s3 = new HashSet<Integer> ();
		s3.addAll(s2);
		
		System.out.println(s3.containsAll(s2));
		s3.clear();
		System.out.println(s3);
		
		HashSet<Integer> s4 = (HashSet<Integer>) s.clone();
		System.out.println("cloned hashset is : "+s4);
		
		System.out.println(s.containsAll(s4));
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(3);
		lhs.add(2);
		lhs.add(1);
		System.out.println("linked hash set is : "+lhs);
	}
}