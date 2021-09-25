package com.bridgelabz.program_day10;

import java.util.Scanner;

public class MinMaxArray {
	static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for(int i=1; i<inputArray.length; i++) {
			if(inputArray[i]>maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}
	 static int getMin(int[] inputArray){ 
		int minValue = inputArray[0]; 
		for(int i=1;i<inputArray.length;i++){ 
			if(inputArray[i] < minValue){ 
				minValue = inputArray[i]; 
			} 
		} 
		return minValue; 
	} 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		int num = sc.nextInt();
		int[] array = new int[50];
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<num; i++) {
			array[i] = sc.nextInt();
		}
		getMax(array);
		int max = getMax(array);
	    System.out.println("Maximum Value is: "+max);
	    
	    getMin(array);	 
	    int min = getMin(array);
	    System.out.println("Minimum Value is: "+min);
	}
}
