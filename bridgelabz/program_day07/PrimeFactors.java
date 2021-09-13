package com.bridgelabz.program_day07;

import java.util.Scanner;

public class PrimeFactors {
	static void findPrimeFactors(int number) {
		for(int i = 2; i< number; i++) {
			while(number%i == 0) {				
				System.out.println(i+" ");
				number = number/i;				
			}
		}
		if(number >2) {		
			System.out.println(number);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		int number = sc.nextInt();
		findPrimeFactors(number);
	}
}
