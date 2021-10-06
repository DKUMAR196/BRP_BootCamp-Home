package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdd {
	public static void main(String[] args) {
//		creating ArrayList
		List<Integer> list = new ArrayList<>();
//		int sum =1;
		for (int i = 1; i<=100; i++)
		{
			if(i%2==0) {
				list.add(i);
			}
			list.add(i);
		}
//		System.out.println(sum);
		
//		Creating list to use stream
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum of all integer 1 to 100 is : "+sum);
	}
}
