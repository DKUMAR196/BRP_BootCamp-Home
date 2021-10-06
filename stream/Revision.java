package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Revision {
	static void checkOddEven(int firstNum, int secondtNum) {
		
			List<Integer> list = new ArrayList<>();
			for(int num = firstNum; num<=secondtNum; num++ ) {
//				if(num%2==0) {
//					list.add(num);
//					System.out.println(num);
//				}
			list.add(num);			
		}	
			List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
			System.out.println(evenList);
			int sum = evenList.stream().mapToInt(Integer::intValue).sum();
			System.out.println(sum+ " sum of even number is:");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter second number: ");
		int secondtNum = sc.nextInt();
		sc.close();
		checkOddEven(firstNum,secondtNum);
	}

}
