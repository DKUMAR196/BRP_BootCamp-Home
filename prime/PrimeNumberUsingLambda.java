package com.bridgelabz.prime;

import java.util.Scanner;

interface Prime{
	void checkPrime(int num);	
}

public class PrimeNumberUsingLambda {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		Prime p;
		p = (x)->{
			int temp = 0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp + 1;
				}
			}
			if(temp==0 && num!=1) {
				System.out.println(num+ " the number is prime: ");
			}
			else 
			{
				System.out.println(num+ " number is not prime: ");
			}
		};	
		p.checkPrime(num);
	}
}
