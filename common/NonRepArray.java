package com.bridgelabz.program.common;

import java.util.Scanner;

public class NonRepArray {

	public static void nonRepeating(int a[],int n)
	{
		int count;
		System.out.println("Non Repeating element in array");

		for(int i=0;i<n;i++)
		{
			count=0;	             
			for (int j=0; j<n; j++)
			{	                  
				if(a[i]==a[j] && i!=j)
					count++;
			}	            
			if(count == 0)
				System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		System.out.println("enter elements of an array");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		nonRepeating(a,size);
	}
}



