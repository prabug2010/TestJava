package com.map.codes;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadingFromProp {

	public static void main(String[] args) {
		
		
		try
		{
			FileReader file = new FileReader("testconfig.properties");
			FileReader file2 = new FileReader("textconfig2.properties");
			Properties prop = new Properties();
			Properties prop2 = new Properties();
			prop.load(file);
			prop2.load(file2);
			HashMap<Object, Object> h1 = new HashMap<>(prop);
			for(Object o : prop2.keySet())
			{
				if(!h1.containsKey(o))
				{
					h1.put(o, prop2.get(o));
				}
			}
			
			for(Map.Entry<Object, Object> ent : h1.entrySet())
			{
		System.out.println(ent.getKey()+" : "+ent.getValue());
			}
			System.out.println(h1);
			}catch(IOException e)
		{
		e.printStackTrace();
	}

	}
}