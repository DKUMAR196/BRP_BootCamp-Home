package com.bridgelabz.program.common;

import java.util.Scanner;

interface MyInterface{
    void add(int a, int b);
    void sub(int a, int b);
	void multi(int a, int b);	
}

 public class DiffOperations implements MyInterface{	
	@Override
	public void add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
		
	}
	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
		
	}
	@Override
	public void multi(int a, int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of b:");
		int num2 = sc.nextInt();
		sc.close();
		
		DiffOperations mi = new DiffOperations();
		mi.add(num2, num2);
		mi.sub(num2, num2);
		mi.multi(num2, num2);
	}
}
