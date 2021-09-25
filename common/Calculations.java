package com.bridgelabz.program.common;

import java.util.Scanner;

interface MyInter{
	void add(int a , int b);
	void sub(int a , int b);
	void multi(int a , int b);
	void divide(int a , int b);	
}
public class Calculations implements MyInter{
	@Override
	public void add(int a , int b) {
		System.out.println("Sum of two number " +a+ " "+ b+ " : "+(a+b));		
	}

	@Override
	public void sub(int a , int b) {
		System.out.println("Sub of two number " +a+ " & "+ b+ " : "+(a-b));		
	}

	@Override
	public void multi(int a , int b) {
		System.out.println("Multi of two number " +a+ " & "+ b+ " : "+(a*b));		
	}

	@Override
	public void divide(int a , int b) {
		System.out.println("Divide of two number " +a+ " & "+ b+ " : "+(a/b));		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Calculations c =new Calculations();
		int choice = 0;
		while(choice !=5) {
			System.out.println("  ");
			System.out.println("Enter 1 for Add");
			System.out.println("Enter 2 for Sub");
			System.out.println("Enter 3 for Multi");
			System.out.println("Enter 4 for Divide");
			System.out.println("Enter 5 for Exit");
			System.out.println("  ");
			choice = sc.nextInt();			

			switch(choice) {			
			case 1:
				System.out.println("Enter the value of a: ");
				int a =sc.nextInt();
				System.out.println("Enter the value of b: ");
				int b = sc.nextInt();
				c.add(a, b);
				break;

			case 2:
				System.out.println("Enter the value of x: ");
				int x =sc.nextInt();
				System.out.println("Enter the value of y: ");
				int y = sc.nextInt();
				c.sub(x, y);
				break;

			case 3:
				System.out.println("Enter the value of d: ");
				int d =sc.nextInt();
				System.out.println("Enter the value of e: ");
				int e = sc.nextInt();
				c.multi(d, e);
				break;

			case 4:
				System.out.println("Enter the value of f: ");
				int f =sc.nextInt();
				System.out.println("Enter the value of g: ");
				int g = sc.nextInt();
				sc.close();
				break;	
			}
		}		
	}
}

