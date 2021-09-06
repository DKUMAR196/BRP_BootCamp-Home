package com.bridgelab.program.basic;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number: ");
		int num = sc.nextInt();
//		int num =1221;
		int rem;
		int rev=0;
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 +rem;
			num = num/10;
		}
		if (num == 0)
		{
			System.out.println("Number is palidrome : ");
		}
		else
		{
			System.out.println("Number is not palidrome : ");
		}
	}
}

