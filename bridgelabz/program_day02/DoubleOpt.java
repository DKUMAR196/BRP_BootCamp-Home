package com.bridgelabz.program_day02;

import java.util.Scanner;


public class DoubleOpt {
	
	public static void operationOprate(double a, double b, double c) {
		double Operations01;
		Operations01 = a+(b*c);
		System.out.println("Print the value of Operations01: "+Operations01);
		
		double Operations02;
		Operations02 = (a*b)+c;
		System.out.println("Print the value of Operations01: "+Operations02);
		
		double Operations03;
		Operations03 = c+(a/b);
		System.out.println("Print the value of Operations01: "+Operations03);
		
		double Operations04;
		Operations04 = (a%b)+c;
		System.out.println("Print the value of Operations01: "+Operations04);		
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a = sc.nextDouble();
	
		System.out.println("Enter the value of b: ");
		double b = sc.nextDouble();
	
		System.out.println("Enter the value of c: ");
		double c = sc.nextDouble();	
		operationOprate(a,b,c);
	}	
}



