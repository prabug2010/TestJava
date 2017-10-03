package com.list.codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDups {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("a");
		l2.add("b");
		l2.add("c");
		l2.add("d");
		l2.addAll(l1);
		List<String> l3 = new ArrayList<String> (new HashSet<String> (l2));
		System.out.println(l3);
		
				for(int i=0; i<l2.size(); i++)
		{
			for(int j=i+1; j<l2.size(); j++)
			{
				if(l2.get(i).equals(l2.get(j)))
				{
					l2.remove(i);
					j--;
				}
			}
		}
		System.out.println(l2);
		
		String[] s = l2.toArray(new String[l2.size()]);
		
		for(String x: s)
		{
			System.out.print(x+",");
		}
		
	}
}