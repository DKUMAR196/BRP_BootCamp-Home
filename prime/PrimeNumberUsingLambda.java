package com.bridgelabz.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumberUsingLambda {
	public static void main(String[] args) {
		List<Integer> list = List.of(3,4,5,6,7,8);
		
		List<Integer> newList = new ArrayList<>();
//		for(Integer i : list) {
//			if(i%2==0) {
//				newList.add(i);
//			}
//		}
//		System.out.println(list);
//		System.out.println(newList);
		List<Integer> evenList = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);
	}
}
