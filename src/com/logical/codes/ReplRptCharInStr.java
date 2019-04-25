package com.logical.codes;

public class ReplRptCharInStr {

	public static void main(String[] args) {

		String[] s = new String[] {"t","h","i","n","k","i","n","g"};
		int n = s.length;
		
		for(int i=0; i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(s[i]==s[j])
				{
					System.out.println("repeated char is : "+s[j]);
					
				}
			}
		}
	}

}
