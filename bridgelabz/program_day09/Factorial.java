package com.bridgelabz.program_day09;

import java.util.Scanner;

public class Factorial {
	static void findFactorial(int num){
		int factorial = 1;
		for(int i=1; i<=num; i++) {
			factorial = factorial*i;
		}
		System.out.println("factorial of entered number is: " +factorial);		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		sc.close();
		findFactorial(num);
	}
}
