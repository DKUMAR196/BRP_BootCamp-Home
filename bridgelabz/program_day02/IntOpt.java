package com.bridgelabz.program_day02;

import java.util.Scanner;

public class IntOpt {
	
	public static void operationOprate(int a, int b, int c) {
		int Operations01;
		Operations01 = a+(b*c);
		System.out.println("Print the value of Operations01: "+Operations01);
		
		int Operations02;
		Operations02 = (a*b)+c;
		System.out.println("Print the value of Operations01: "+Operations02);
		
		int Operations03;
		Operations03 = c+(a/b);
		System.out.println("Print the value of Operations01: "+Operations03);
		
		int Operations04;
		Operations04 = (a%b)+c;
		System.out.println("Print the value of Operations01: "+Operations04);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the value of c: ");
		int c = sc.nextInt();
		operationOprate(a,b,c);
	}
}
