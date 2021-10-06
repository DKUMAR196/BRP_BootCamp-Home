package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfInteger {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<=100; i++) {
//			if(i%2==0) {
//				list.add(i);
//				System.out.println(i);
//			}
			list.add(i);
		}
		List<Integer> listEven = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(listEven);
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of all integer from 1 to 100 is: "+sum);
		
		int evenSum = listEven.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all even number from 1 to 100 is: "+evenSum );
		
	}

}
