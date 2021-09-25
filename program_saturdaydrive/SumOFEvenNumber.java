package com.bridgelabz.program_saturdaydrive;

import java.util.Scanner;

public class SumOFEvenNumber {
	static void findSumEvenNumber(int num) {
		int sum =0;
		for(int i =1; i<=num; i++) {
			if(i%2==0) {
				sum = sum+i;			
			}			
		}
		System.out.println("Sum of all evenNumber is :"+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close();
		findSumEvenNumber(num);
	}
}
