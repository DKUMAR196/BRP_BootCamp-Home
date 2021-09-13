package com.bridgelabz.program.common;

public class SearchMin {
	public static void main(String [] args)
	{
//		int[] a = {6, 2, 9, 1, 5};
		int[] a = {16, 12, 91, 21, 15};
		int min = a[0];
		for(int i = 1; i<a.length; i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		System.out.println("minimum elements of an array a is: " +min);
	}
}
