package com.bridgelabz.program_day03;

import java.util.Scanner;

public class DayOfWeek {
	static void insertData(int day, int month, int year) {
		int y = 0 ,m = 0,d = 0,x=0;
		y = year-(14-month)/12;
		x = y+y/(4-(y/100))+(y/400);
		
		m = month+12*((14-month)/12)-2;
		d = (day+x+31*m/12)%7;
		
		switch(d) {
		case 0:
			System.out.println("Sunday");
			break;
			
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wenesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Satarday");
			break;		
		}
}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Day");
		int day = sc.nextInt();
		System.out.println("Enter your Month");
		int month = sc.nextInt();
		System.out.println("Enter your Year");
		int year = sc.nextInt();
		insertData( day,month,year);
	}
}
