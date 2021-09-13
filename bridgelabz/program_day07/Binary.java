package com.bridgelabz.program_day07;

import java.util.Scanner;

public class Binary {
	static void findBinary(int a, int n) {
		int count = 0;
		String x = "";
		while(n > 0)
		{			
			a = n % 2;
			if(a == 1)
			{
				count++;
			}
			x = a + "" + x;
			n = n / 2;
		}
		System.out.println("Binary number: "+x);
		System.out.println("No. of 1s: "+count); 
	}

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any decimal number:");
		int n = sc.nextInt();
		sc.close();
		findBinary(n, n);
	}
}
