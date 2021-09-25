package com.bridgelabz.program_saturdaydrive;

import java.util.Scanner;

public class PrimeNumber {
	static void findPrimeNumber(int num) {
		int temp =0;
		for(int i=2; i<=num-2; i++ ) {
			if(num%i==0) {
				temp = temp+1;
			}			
		}
		if(temp==0 && num!=1) {
			System.out.println("Number is prime number: "+num);
		}
		else {
			System.out.println("Number is not prime: "+num);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		findPrimeNumber(num);
	}
}
