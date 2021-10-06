package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevisionStream {
	static void checkOddEven(int numStart, int numEnd) {
		int sum = 0 ;
		for(int num = numStart; num<=numEnd; num++) {
			if(num%2==0)
			{
				System.out.println(num+ " Even num");
				sum = sum +num;
				System.out.println(sum+ " sum of even number");
			}
			else 
			{
				System.out.println(num+ " Odd num");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number: ");
		int numStart = sc.nextInt();
		System.out.println("Enter the end number: ");
		int numEnd = sc.nextInt();
		sc.close();
		checkOddEven(numStart,numEnd);
	}
}
