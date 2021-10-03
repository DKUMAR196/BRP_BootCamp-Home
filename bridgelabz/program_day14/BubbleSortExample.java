package com.bridgelabz.program_day14;

import java.util.Scanner;

public class BubbleSortExample {
	static void bubbleSort(int[] arr) {  
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  
			}  
		}  
	} 

	public static void main(String[] args) {  
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the array we want to do:");
//		int n = sc.nextInt();
//		int arr[] = new int [n];
//		System.out.println("Enter the elements of an array is: ");
//		for(int i = 0; i <=n; i++) {
//			arr[i] = sc.nextInt();
//		}
		
		int arr[] ={3,60,35,2,45,320,5};  

		System.out.println("Array Before Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  
		System.out.println();  

		bubbleSort(arr);//sorting array elements using bubble sort  

		System.out.println("Array After Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}    
	}  
}
