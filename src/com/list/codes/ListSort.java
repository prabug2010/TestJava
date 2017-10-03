package com.list.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class ListSort {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<> ();
		s.add("one");
		s.add("two");
		s.add("four");
		ArrayList<String> l1 = new ArrayList<String>(s);
		System.out.println("before sorting : "+l1);
		System.out.println("after sorting : "+l1);
		Collections.sort(l1);
		String[] str = s.toArray(new String[s.size()]);
		for(String x : str)
		{
			System.out.println(x);
		}
		ArrayList<String> l2 = new ArrayList<String> (Arrays.asList(str));
		System.out.println(l2);
	}
}