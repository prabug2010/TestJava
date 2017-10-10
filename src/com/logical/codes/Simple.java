package com.logical.codes;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class Simple {
	
	void test(int n, String s)
	{
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer> ();
		lh.put(s, n);
		TreeMap<String, Integer> t1 = new TreeMap<String, Integer> (lh);
	//	System.out.println(lh.entrySet());
		System.out.println(t1.entrySet());
		
	}

	public static void main(String[] args) {

		Simple t = new Simple();
		t.test(101, "m");
		t.test(10, "n");
		t.test(9, "a");
	}

}
