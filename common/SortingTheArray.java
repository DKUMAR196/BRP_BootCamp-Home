package com.bridgelab.program.common;

import java.util.Scanner;

public class SortingTheArray {
	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array: ");
//		int arr = sc.nextShort();
		int[] arr = {2,3,1,4,5};
		int temp=0;
		for(int i=0; i<arr.length; i++) 
		{		
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j]) 
				{			
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;		
		}
		}
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
	