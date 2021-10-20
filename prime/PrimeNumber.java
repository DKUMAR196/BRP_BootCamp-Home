package com.bridgelabz.prime;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int num =1; num<=100; num++) {


			//int num = 5;
			int temp = 0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) 
				{
					temp = temp+1;
				}

			}
			if (temp == 0) 
			{
				System.out.println(" prime number : " +num);
				//				System.out.println("number is prime : " );
			}
			//		else			
			//			{
			//				System.out.println("number is not prime: ");
			//			}
		}	
	}
}
