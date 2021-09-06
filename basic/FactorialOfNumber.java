package com.bridgelab.program.basic;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number is: ");
		int num = sc.nextInt();
		
		int factorial = 1 ;
		for(int i =1; i<=num; i++) 
		{
		factorial = factorial*i;
		}
		System.out.println("The factorial of the number " +num+ " is : " +factorial );
	}
}
