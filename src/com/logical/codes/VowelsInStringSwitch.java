package com.logical.codes;

public class VowelsInStringSwitch {

	public static void main(String[] args) {

		String s = "I Am A test Engineer";
		s=s.toLowerCase();
		char[] c = s.toCharArray();
		int i=0;
		for(char ch : c)
		{
		switch(ch)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			i++;
			break;
			default :
		}
	}
System.out.println(i);
}
}
