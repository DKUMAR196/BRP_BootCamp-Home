package com.bridgelabz.program_saturdaydrive;

import java.util.Scanner;

public class PerfectSqrt {
	static void checkPerfectSqrt(int num) {
		for(int i=1; i<num; i++) {
			if(i*i==num) {
				System.out.println("Given number is Sqrt of " +i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		sc.close();
		checkPerfectSqrt(num);
	}
}
