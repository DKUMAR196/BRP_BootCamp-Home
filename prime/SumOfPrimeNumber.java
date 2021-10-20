package com.bridgelabz.prime;

import java.util.Scanner;

public class SumOfPrimeNumber {
	static void findSumOfPrimeNumber(int firstNum, int lastNum) {
		int sum =0;
		for(int num = firstNum; num<=lastNum; num++ ) {
			int temp =0;
			for(int i=2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp ==0 && num!=1) {
				System.out.println(num +" is prime");
				sum = sum + num;
				System.out.println("sum of prime number is "+sum);
			}
			else {
				System.out.println(num + " is not prime");
			}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number is: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter last number is: ");
		int lastNum = sc.nextInt();
		sc.close();
		findSumOfPrimeNumber(firstNum,lastNum);
	}
}
