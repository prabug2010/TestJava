package com.list.codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListCode {
	
	public static void main(String args[])
	{
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(1, 2);
	Integer[] a1 = a.toArray(new Integer[a.size()]);
	ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(a1));
	Iterator i1 = a2.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	}
	
}
