package com.bridgelabz.lambda;

import java.util.Scanner;

public class SumOfPrimeNumber {
	static void findSumOfPrimeNumber(int firstnum, int lastnum){
		int sum = 0;
		for(int num =firstnum; num<=lastnum; num++) {
			int temp = 0;
			for(int i=2; i<=num-1; i++) 
			{
				if(num%i==0) {
					temp = temp+1;
//					break;
				}
			}
			if(temp==0 && num!=1) 
			{
				sum = sum+num;
				System.out.println(+num+" is prime number :");
				System.out.println("__________________________");
				System.out.println("Sum of prime number is :"+sum);
			}
		}
	}		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number");
		int firstnum = sc.nextInt();
		System.out.println("Enter last number");
		int lastnum = sc.nextInt();
		sc.close();
		findSumOfPrimeNumber(firstnum,lastnum);
	}
}
