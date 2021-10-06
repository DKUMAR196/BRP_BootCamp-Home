package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAdd02 {
	public static void main(String[] args) {
//		Creating a List
		List<Integer> values = new ArrayList<>();
		for(int i=1; i<=100; i++) 
		{
			values.add(i);
		}
//		values.forEach(System.out::println);
		values.stream().forEach(System.out::println);
		
//		To print 1 to 100 even number using stream api
		List<Integer> evenNumber = values.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
				
//		To print sum 1 to 100 Numbers using Strem api
		int num = values.stream().mapToInt(Integer::intValue).sum();
		System.out.println("The sum of 1 to 100 Numbers is:"+num);
		System.out.println(num);
		
//		sum of even number 1 to 100
		double sum01 =  evenNumber.stream().mapToDouble(Integer::intValue).sum();
		System.out.println("Sum of even number from 1 to 100 is : "+sum01);		
	}
}
