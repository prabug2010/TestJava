package com.map.codes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapIntoMap {
	public static void main(String args[])
	{
		HashMap<String, String> m1 = new LinkedHashMap<String,String>();
		m1.put("a", "100");
		m1.put("b", "101");
		m1.put("c", "102");
		m1.put("d", "103");
		HashMap<String, HashMap<String,String>> m2 = new HashMap<String,HashMap<String,String>>();
			m2.put("GEN", m1);
			m2.put("GEN1", m1);
			
			for(Map.Entry<String, HashMap<String, String>> entry : m2.entrySet())
					{
				System.out.println(entry.getKey()+" "+ entry.getValue());
					}
}
}
