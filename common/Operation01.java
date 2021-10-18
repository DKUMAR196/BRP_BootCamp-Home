package com.bridgelabz.program.common;

import java.util.Scanner;

public class Operation01 {
	static void checkOperation01(int num) {
		int rem = 0;
		int sum = 0;
		int product =1;
		while(num>0) {
			rem = num%10;
			sum = sum +rem;
			product = product*rem;
			num = num/10;
		}
		System.out.println("Sum of the given digit is "+sum);
		System.out.println("Product of the given digit is "+product);
		System.out.println("Difference of "+product+ " - "+sum+ " = "+(product-sum));		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		checkOperation01(num);		
	}
}
