package com.bridgelabz.program_saturdaydrive;

import java.util.Scanner;

public class PalindromeNumber {
	static void checkPalindromeNumber(int num){
		int rev = 0;
		int rem;
		int temp = num;
		while(num!=0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;			
		}
		if(temp == rev) {
			System.out.println("num is palindrome");
		}
		else {
			System.out.println("num is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		checkPalindromeNumber(num);
	}
}
