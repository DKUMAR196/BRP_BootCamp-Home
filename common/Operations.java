package com.bridgelabz.program.common;

import java.util.Scanner;

public class Operations {
	public static void performedOperation(int first, int second) {
		int add, multiply;
		float result;

		add = (first + second);		   
		multiply = (first * second);	    
		result = (multiply - add);

		System.out.println("Sum = " + add);	
		System.out.println("Multiplication = " + multiply);	    
		System.out.println("Result =" +result);	    		
	}

	public static void main(String [] args) {			   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Two Numbers : ");
		int first = sc.nextInt();
		int second = sc.nextInt();
		performedOperation(first,second);	    	    
	}
}
