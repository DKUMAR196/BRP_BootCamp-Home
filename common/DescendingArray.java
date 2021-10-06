package com.bridgelabz.program.common;

import java.util.Scanner;

public class DescendingArray {
	static void findDescendingArray(int arr[]) {
		int temp = 0;
		int target = 12;
		//Displaying elements of original array    
		System.out.println("Elements of original array: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}    
		//Sort the array in descending order    
		for (int i = 0; i < arr.length; i++) {     
			for (int j = i+1; j < arr.length; j++) {     
				if(arr[i] < arr[j]) {    
					temp = arr[i];    
					arr[i] = arr[j];    
					arr[j] = temp;    
				}     
			}     
		}    
		System.out.println();               
		//Displaying elements of array after sorting    
		System.out.println("Elements of array sorted in descending order: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");
			
			
			if(arr[i]>target && target>arr[i+1]) {
				temp = arr[i+1];
				arr[1] = target;
				arr[i+1] = temp;
			}			
		}
	}    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements you want to store:");
		int n = sc.nextInt();
		//creating an array in the memory of length n
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i = 0; i<n; i++) {
			//reading array elements from the user
			arr[i] = sc.nextInt();
		}
		findDescendingArray(arr);		
	}
}
