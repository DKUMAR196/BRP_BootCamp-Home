package com.bridgelabz.program_day06;

import java.util.Scanner;

public class Array {
	static void findDuplicateElement (int arr[],int n) {
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++)
        {
             a[i]=sc.nextInt();
        }
        findDuplicateElement (a,size);
	}
}
