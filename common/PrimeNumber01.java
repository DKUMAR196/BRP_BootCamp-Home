package com.bridgelabz.program.common;

import java.util.Scanner;

public class PrimeNumber01 {
	static void checkPrimeNumber01(int firstNum, int lastNum) {
		for(int num = firstNum; num<=lastNum; num++ ) {
			int temp =0;
			for(int i=2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp ==0 && num!=1) {
				System.out.println(num );			
			}
//			else {
//				System.out.println(num );
//			}	
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstNum");
		int firstNum = sc.nextInt();
		System.out.println("Enter lastNum");
		int lastNum = sc.nextInt();
		System.out.println("Prime numbers between " +firstNum+ " and " +lastNum+" are: ");
		sc.close();
		checkPrimeNumber01(firstNum,lastNum);
	}
}
