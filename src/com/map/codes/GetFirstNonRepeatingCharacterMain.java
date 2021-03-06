package com.map.codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetFirstNonRepeatingCharacterMain {
	 public static void main(String[] args) {
	  System.out
	    .println("First non repeated character for String analogy is : "
	      + getNonRepeatedCharacter("analogy"));
	  System.out
	    .println("First non repeated character for String easiest is : "
	      + getNonRepeatedCharacter("easiest"));
	 }
	 
	 public static Character getNonRepeatedCharacter(String str) {
	  Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
	  System.out.println("Map size is : "+countCharacters.size());
	  for (int i = 0; i < str.length() - 1; i++) {
	   Character c = str.charAt(i);
	   if (!countCharacters.containsKey(c)) {
	    countCharacters.put(c, 1);
	   } else {
	    countCharacters.put(c, countCharacters.get(c) + 1);
	   }
	  }
	  // As LinkedHashMap maintains insertion order, first character with
	  // count 1 should return first non repeated character
	  for (Map.Entry<Character, Integer> e : countCharacters.entrySet()) {
	   if (e.getValue() == 1)
	    return e.getKey();
	  }
	  
	  for(Map.Entry<Character, Integer> ent : countCharacters.entrySet())
	  {
		  if(countCharacters.get(ent)>1)
		  {
			  System.out.println("The duplicate char is : "+ent.getKey()+"& the count is : "+ent.getValue());
		  }
	  }
	  return null;
	  
	 }
	
	}