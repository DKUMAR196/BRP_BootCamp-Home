package com.bridgelabz.program_day01;

import java.util.Scanner;

public class LeapYear {
	static void findLeapYear(int year) {
		if(year%4==0)
		{
			System.out.println("Leap Year: "+year);
		}
		else
		{
			System.out.println("Not a Leap Year: "+year);
		}
	}
	
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		findLeapYear(year);
	}
}
