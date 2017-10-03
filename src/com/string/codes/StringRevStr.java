package com.string.codes;

public class StringRevStr {

	public static void main(String[] args) {
		String st = "My name is XXX";
		String[] s = st.split(" ");
		int n = s.length;
		for(int i =n-1; i>=0; i--)
		{
			System.out.print(s[i]+" ");
		}
		String reverseString = "";
        
        for (int i = 0; i < s.length; i++) 
        {
            String word = s[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
     //   System.out.println(st);
         
        System.out.println(reverseString);
		

	}

}
