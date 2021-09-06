package com.bridgelabz.program_day04;

import java.util.Scanner;

public class TemperaturConversion {
	public void tempConvert(int f, int c) {
		double celsius ;
		double fahrenheit;
		celsius=((f-32)*5)/9;
		System.out.println("value of fahreinheit in celsius "+celsius);
		fahrenheit = ((c * 9/5) + 32); 
		System.out.println("value of celsius in fahrenheit "+fahrenheit);
	}
	
	
	public static void main(String[] args) {
		TemperaturConversion tc = new TemperaturConversion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of fahreinheit: ");
		int f1 = sc.nextInt();
		System.out.println("Enter the value of Celsius: ");
		int c1 = sc.nextInt();
		tc.tempConvert(f1, c1);				
	}
}
