package com.bridgelabz.program_day09;

import java.util.Scanner;

public class MathFunction {
	static double findHarmonic(double num) {
		double sum = 0;
		for(double i=1; i<=num; i++) {
			sum = sum +(1/i);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		 num = sc.nextDouble();
		double h = findHarmonic(num);
		System.out.println("Harmonic value = "+h);		
	}
}
