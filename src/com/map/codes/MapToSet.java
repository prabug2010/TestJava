package com.map.codes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MapToSet {

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		h1.put("a", 1);
		h1.put("b", 2);
		h1.put("c", 3);
		Set<String> s1 = new HashSet(h1.keySet());
		Set<String> s2 = new HashSet(h1.values());
		System.out.println(s1);
		System.out.println(s2);
	}

}