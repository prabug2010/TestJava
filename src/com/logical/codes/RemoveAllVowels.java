package com.logical.codes;

public class RemoveAllVowels {

	public static void main(String[] args) {

		String s = "java unexplored";
		String x=s.replaceAll("[AEIOUaeiou]", "");
		System.out.println(x);
	}

}
