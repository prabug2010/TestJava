package com.list.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListCode {
	
	public static void main(String args[])
	{
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(4);
	a.add(3);
	a.add(1);
	a.add(1, 2);
	System.out.println("first print"+a.get(2));
	Integer[] a1 = a.toArray(new Integer[a.size()]);
	ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(a1));
	Iterator<Integer> i1 = a2.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	
	HashSet<Integer> s1 = new HashSet<Integer>(a);
	System.out.println(s1);
	}
}