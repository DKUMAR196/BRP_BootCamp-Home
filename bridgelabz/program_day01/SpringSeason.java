package com.bridgelabz.program_day01;

import java.util.Scanner;

public class SpringSeason {
	static void springSeason(int day, int month) {
		if ((day>=20 && month==3)||(day<=30 && month==4)||
				(day<=31 && month ==5) ||(day<=20 && month==6))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int month = sc.nextInt();
		System.out.println("Enter the day: ");
		int day = sc.nextInt();
		springSeason(day,month);
	}
}
