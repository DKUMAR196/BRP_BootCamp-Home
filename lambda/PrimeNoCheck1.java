package com.bridgelabz.lambda;

public class PrimeNoCheck1 {
	public static void main(String[] args) {
		int sum = 0;
		//This for is to iterate num from 1 to 30
		for(int num=1; num<=30; num++) {
			int i,temp = 0;
			// This for loop is to check which no is prime and gives output
			for(i=2; i<num; i++) {
				if(num%i==0) {
					temp = temp+1;
					break;
				}
			}
			if(temp ==0) {
				sum=sum+num;
				System.out.println(num+"this is prime number");
				System.out.println("sum is "+sum);
			}
			else
			{
				System.out.println(num+"this is not prime number");
			}
		}
	}	
}
