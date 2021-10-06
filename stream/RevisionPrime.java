package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevisionPrime {
	static void checkPrime(int firstNum, int lastNum) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		for(int num = firstNum; num<=lastNum; num++) {
			int temp = 0;
			for(int i=2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp == 0 && num!=0) {
				System.out.println(num+ " Prime Number");
				list.add(num);
			
//				sum = sum + num;
//				System.out.println("Sum of prime Number is "+sum);
				
//				int primeSum = list.stream().mapToInt(Integer::intValue).sum();
//				System.out.println("Sum of prime Number is "+primeSum);
//			}
//			else {
//				System.out.println(num+ " Not a prime Number");
			}
		}
	}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstNum: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter the secondNum: ");
		int lastNum = sc.nextInt();
		sc.close();
		checkPrime(firstNum,lastNum);
	}
}
