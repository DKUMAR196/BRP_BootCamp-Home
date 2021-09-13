package com.bridgelabz.program_day06;

import java.util.Scanner;

public class PrimeNumber {
	static void findRangeOfPrimeNumber(int startnum, int endnum) {				
		for(int num = startnum; num<=endnum; num++) {
			int temp =0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp==0) {
				System.out.println("Prime number is: "+num);
			}			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range: ");
		int startnum = sc.nextInt();
		System.out.println("Enter End range: ");
		int endnum = sc.nextInt();
		findRangeOfPrimeNumber(startnum,endnum);
	}
}
