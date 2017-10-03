package com.set.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCode {
	
	public static void main(String args[])
	{
		Set<Integer> s = new HashSet<Integer> ();
		s.add(1);
		s.add(2);
		s.add(4);
		s.add(5);
		s.add(3);
		System.out.println(s);
		List<Integer> l1 = new ArrayList<Integer> (s);
		Collections.sort(l1);
		Integer[] n = s.toArray(new Integer[s.size()]);
		System.out.println(s);
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
		System.out.println(s3);
		System.out.println(s3.containsAll(s2));
		s3.clear();
		System.out.println(s3);
		
		Set<Integer> s4 = new HashSet<Integer> (Arrays.asList(n));
		Integer[] in = s4.toArray(new Integer[s4.size()]);
		System.out.println(s4);
		for(Integer y : in)
		{
			System.out.println(y);
		}
	}
}