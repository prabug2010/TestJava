package com.string.codes;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String s = "i love india";
		String[] st = s.split(" ");
		int n = st.length;
		String capitalword="";
		for(String x : st)
		{
			String first = x.substring(0, 1);
			String remaining = x.substring(1);
			capitalword += first.toUpperCase()+remaining+" ";
		}
		System.out.println(capitalword);
		
	}

}
