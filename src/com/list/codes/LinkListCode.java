package com.list.codes;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListCode {
	
	public static void main(String args[])
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("one");
		l1.add("two");
		l1.addFirst("zero");
		l1.add("four");
		l1.addLast("three");
		
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println("size of linked list is : "+l1.size());
		System.out.println(l1.indexOf("four"));
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.pop());
		System.out.println(l1.pollFirst());
		System.out.println(l1);
		
		ListIterator l = l1.listIterator();
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
	}

}
