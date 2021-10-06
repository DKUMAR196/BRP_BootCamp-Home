package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimeNumber {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int num=1; num<=100; num++) {
			int temp = 0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp==0 && num!=1) {
				System.out.println(+num + " is prime");
				list.add(num);
				System.out.println("_______________________");
				System.out.println(num);

				System.out.println("...........................");

				int sum = list.stream().mapToInt(Integer::intValue).sum();
				System.out.println("Sum prime number is: " +sum);
			}
			//			else {
			//				System.out.println(+num+ " is not prime");
			//			}
			//			list.add(num);
		}		
	}
}
