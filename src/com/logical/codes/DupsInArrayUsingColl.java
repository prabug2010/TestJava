package com.logical.codes;

import java.util.Arrays;
import java.util.HashSet;

public class DupsInArrayUsingColl {

	public static void main(String[] args) {
	String[] nriAccounts = {"NRE", "NRO", "FCNR", "RFC", "NRE"}; 
	// let's convert this array to HashSet in Java 
	// if array contains any duplicate than that would be lost 
	HashSet<String> setOfAccounts = new HashSet<>(Arrays.asList(nriAccounts)); 
	
	System.out.println("Array contains: " + Arrays.toString(nriAccounts)); 
	System.out.println("HashSet contains: " + setOfAccounts); 
	// if array contains duplicate than HashSet will have fewer 
	// elements than array 
	System.out.println("length of array: " + nriAccounts.length); 
	System.out.println("size of HashSet: " + setOfAccounts.size()); 
	// Elements order will not be preserved when you convert an 
	// array to HashSet in Java, as Set is an unordered collection. 
	System.out.println("Iterating over array in Java"); 
	for(String account: nriAccounts){ System.out.println("array: " + account); 
	} 
	System.out.println("Iterating over HashSet in Java"); 
	for(String account: setOfAccounts)
	{ System.out.println("hashset: " + account); 
	}
	
	int[] a = new int[] {1,2,3,2,1,3};
	HashSet<Integer> hs = new HashSet<Integer> ();
	for(int i=0; i<a.length; i++)
	{
		hs.add(a[i]);
	}
	System.out.println(hs);

	}

}
