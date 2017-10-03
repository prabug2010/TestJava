package com.pattern.codes;

public class NumberPyramid {

	public static void main(String[] args) {
		 int n=1;
		 for (int i = 0; i < 5; i++) 
			{ 
			for (int j = 0; j < 5 - i; j++) 
			{ 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) 
			{ 
				System.out.print(n+" ");
				n++;
			} 
			System.out.println(); 
			}
	}

}
