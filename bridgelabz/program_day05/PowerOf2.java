package com.bridgelabz.program_day05;

import java.util.Scanner;

public class PowerOf2 {
	public static void getPowerOfTwo(int n) {
		if (n>=0 && n<=31) {
			int power = 0;
			for (int i=0; i<=n; i++) {
				power = (1<<i);
				System.out.println("2^"+i+ "  =  "  +power);
			}
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Power of 2 is: ");		
		int n = sc.nextInt();
		getPowerOfTwo(n);		
	}
}
