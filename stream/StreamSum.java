package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamSum {
	static void findSumOfPrimeNumber(int firstNum, int lastNum) {
		//		int sum = 0;
		List<Integer> list = new ArrayList<>();
		for(int num = firstNum; num<=lastNum; num++) {

			int temp = 0;
			for(int i = 2; i<=num-1; i++) {
				if(num%i==0) {
					temp = temp+1;

				}
			}
			if(temp == 0 && num != 1) {
				System.out.println(num+ " is prime ");
				list.add(num);
				//				sum = sum + num;
				//				System.out.println("sum of prime number is : "+sum);
				int sum = list.stream().mapToInt(Integer::intValue).sum();
				System.out.println("sum of prime number is :" +sum);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstNum");
		int firstNum = sc.nextInt();
		System.out.println("Enter the lastNum");
		int lastNum = sc.nextInt();
		sc.close();
		findSumOfPrimeNumber(firstNum,lastNum);
	}
}
