package com.map.codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapToList {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("a", 1);
		h1.put("b", 2);
		h1.put("c", 3);
		
		Iterator itr = h1.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> e = (Entry<String, Integer>) itr.next();
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
		for(Map.Entry<String, Integer> en : h1.entrySet())
		{
			System.out.println(en.getKey()+","+en.getValue());
		}
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		List<String> l1 = new ArrayList<String>(h1.keySet());
		List<Integer> l2 = new ArrayList<Integer>(h1.values());
		System.out.println(l1);
		System.out.println(l2);
	}

}
