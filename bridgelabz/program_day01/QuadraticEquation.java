package com.bridgelabz.program_day01;

import java.util.Scanner;

public class QuadraticEquation {
	static void findRoots(double a, double b, double c) {
		double root1 = 0;
		double root2 = 0;
		double d = b*b-4*a*c; //d=discrimnant
		if(d==0)
		{
			System.out.println("Roots are real: ");
		}
		if(d<=0)
		{
			System.out.println("Roots are imaginary: ");
			root1 = -b/(2*a);
			root2 = c/a;
		}
		if(d>=0)
		{
			System.out.println("Roots are unequal: ");
		}
		System.out.println("The Roots of the Quadratic Equation is: ");
		System.out.println("root1: "+root1);
		System.out.println("root2: "+root2);
	}
	
	public static void main(String [] args) {
//		Quadratic Equation is Equal = -b +/- sqrt b*b-4ac/(2a)
//		Take three input a,b&c from user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of c: ");
		double c = sc.nextDouble();	
		findRoots(a,b,c);
	}
}
