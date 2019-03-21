package com.javatpoint.array;

public class MaxTwoNum {
	
	public static void maxTwo()
	{
		int min = 0;
		int max = 0;
		int[] arr = {10, 18, 22, 32, 16, 9};
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				min = max;
				max = arr[i];
			}
			else if(min<arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("The two maximum numbers in given aray are : "+max+" & "+min);
	}
	
	public static void main(String[] args)
	{
		maxTwo();
	}

}
