package com.bridgelabz.program.common;

public class SmollestArrayExample {
	public static int getSmallest(int[] a, int total) {
		int temp;
		for(int i =0; i<total; i++) 
		{
			for(int j=i+1; j<total; j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[0];
		//return b[total-1];
	}
	public static void main(String[] args)
	{
		int a[] = {6, 2, 9, 1, 5};
		int b[] = {16, 12, 91, 21, 15};
		System.out.println("The smollest number of an array a is : " +getSmallest(a,5));
		System.out.println("The smollest number of an array b is : " +getSmallest(b,5));
	}
}
