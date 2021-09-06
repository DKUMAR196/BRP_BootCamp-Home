package com.bridgelab.program.basic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();		
		int firstTerm =0;
		int secondTerm =1;
		System.out.println("The fibonacci series of " +num+ " is : ");
		for(int i=0; i<=num; i++) {
			System.out.println(firstTerm);
			int nextTerm = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
