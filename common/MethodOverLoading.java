package com.bridgelabz.program.common;

import java.util.Scanner;

public class MethodOverLoading {
	public static void printArray(Integer[] arr) {
		System.out.println("\nThe Integer array is: ");
		 
        // for loop for printing the elements of array
        for (Integer i : arr)
            System.out.print(i + " ");
        	System.out.println();
		
	}
	
	public static void printArray(String[] arr)
    {
        System.out.println("\nThe String array is: ");
 
        // for loop for printing the elements of array
        for (String i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
	

	public static void main(String[] args) {
		Integer[] iarr = { 2, 4, 6, 6, 8 };
		String[]  sarr  = { "Deepak", "Kumar", "Prem", "Sagar", "Name" };
		printArray(iarr);
		printArray(sarr);
	}  
} 
	

