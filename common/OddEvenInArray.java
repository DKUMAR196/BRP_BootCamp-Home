package com.bridgelabz.program.common;

import java.util.Scanner;

public class OddEvenInArray {
	static void findOddEvenInArray(int arr[]) {
		System.out.println("Odd Numbers are..");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2 !=0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Even Numbers are..");
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of an array..");
		int num = sc.nextInt();
		
//		Declare the an array
		int arr[] = new int [num];
		System.out.println("Enter an array values");
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt(); 
		}	
		sc.close();
		findOddEvenInArray(arr);
	}
}
