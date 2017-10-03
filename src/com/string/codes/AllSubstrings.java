package com.string.codes;

public class AllSubstrings {
	
		public static void main(String args[]){
			String str1, str2;
			int length;
			str1  = "Life";
			length = str1.length();   
			System.out.println("Sub-strings of the string \""+str1+"\" are");
			for(int c = 0 ; c < length ; c++ ){
				for(int i = 1 ; i <= length - c ; i++ ){
					str2 = str1.substring(c, c+i);
					System.out.println(str2);
				}
			}
		}
	}