package com.bridgelabz.program.common;

import java.util.Scanner;

public class MaxRepeatingNumArray {
	static void findMaxRepeatingNumArray(int arr[]) {
		 int maxCount = 0;
		 int element=0;
		 for (int i = 0; i <arr.length ; i++) {
		 int count =1;
		 for (int j = i+1; j <arr.length ; j++) {
		 if(arr[i]==arr[j]){
		 count++;
		 }
		 }
		 if(maxCount<count){
		 maxCount=count;
		 element = arr[i];
		 }
		 }
		 System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCount);
		 }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array..");
		int num = sc.nextInt();
		
//		Declare an array
		int arr[] = new int [num];
		System.out.println("Enter an array values");
		for (int i=0; i<num; i++) {
			arr[i] = sc.nextInt(); 
		}
		sc.close();
		findMaxRepeatingNumArray(arr);
	}
}
