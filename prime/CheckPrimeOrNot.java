package com.bridgelabz.prime;

import java.util.Scanner;

interface CheckPrime{
	void prime(int num);
}
public class CheckPrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		CheckPrime p ;
		p = (x)->{
			int temp = 0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp + 1;
					break;
				}
			}
			if(temp == 0 && num!=1) {
				System.out.println(num+ " is prime: ");
			}
			else {
				System.out.println(num+ " is not prime");
			}
		};
		p.prime(num);
	}
}
