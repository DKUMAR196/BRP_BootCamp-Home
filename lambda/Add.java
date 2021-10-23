package com.bridgelabz.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=100; i++) {
//			if(i%2==0) {
//				list.add(i);
//			}
			list.add(i);
		}
		System.out.println("All natural number from 1 to 100 : "+list);
//		int sum = list.stream().mapToInt(Integer::intValue).sum();
//		System.out.println(sum);
		
//		List<Integer> listEven = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(listEven);
//		
//		int sum  = listEven.stream().mapToInt(Integer::intValue).sum();
//		System.out.println("Sum of all even number 1 to 100 are :"+sum);
		
		List<Integer> listOdd = list.stream().filter(i->i%2!=0).toList();
		System.out.println(listOdd);
		
		int sum = listOdd.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all odd number 1 to 100 are :"+sum);
	}
}
