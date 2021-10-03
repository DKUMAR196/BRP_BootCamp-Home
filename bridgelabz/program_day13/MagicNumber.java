package com.bridgelabz.program_day13;

import java.util.Scanner;

public class MagicNumber {
	static void checkMagicNumber(int n,int num) {
		int remainder = 1;  
		int sum = 0;
		num = n;
		while (num > 9)               
		{
			while (num>0) {
				remainder = num%10;
				sum = sum+remainder;
				num = num/10;
			}
			num = sum;
			sum = 0;
		}
		if (num==1) {
			System.out.println(num+" is a magic number.");
		} else {
			System.out.println(num+" is not a magic number.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number you want to check: ");
		int num = sc.nextInt();
		sc.close();
		checkMagicNumber(num,num);
	}
}
