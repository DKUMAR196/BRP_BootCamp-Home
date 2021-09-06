package com.bridgelab.program.common;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
//		int num =5;
		int temp = 0 ;
		for(int i =2; i<=num-1; i++ ) 
		{
			if(num%i==0) 
			{
				temp = temp+1;				
			}			
		}
		if (temp==0)
		{
			System.out.println("The Number is " +num+ " prime." );
		}
		else
		{
			System.out.println("The Number is " +num+ " not prime.");
		}
	}
}