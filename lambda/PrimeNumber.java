package com.bridgelabz.lambda;

import java.util.Scanner;

public class PrimeNumber {
	static void findPrimeNumber(int startnum,int lastnum){

		for(int num =startnum; num<=lastnum; num++)
		{
			int temp =0;
			for(int i =2; i<=num-2; i++) 
			{				
				if(num%i==0) {
					temp = temp+1;
				}	
			}			
			if(temp==0) {
				System.out.println("The prime number of given range is: "+num);
			}			
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start number: ");
		int startnum = sc.nextInt();
		System.out.println("Enter Last number: ");
		int lastnum = sc.nextInt();
		sc.close();		
		findPrimeNumber(startnum,lastnum);
	}
}
