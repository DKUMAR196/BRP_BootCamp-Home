package com.bridgelabz.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
//		Q) Create list and filter even number from list
		
//		Create a list using List.of method emmutable list
		List<Integer> list = List.of(3,4,6,7,8,9,12,25);
		
//		Create an another list to store the value
		List<Integer> listEven = new ArrayList<>();
		for(Integer i:list) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		
		System.out.println(list);
		System.out.println(listEven);
		
//		using Stream API
		Stream<Integer> stream = list.stream();
//		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(stream);
		List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
//		find min values of an arrayList		
	}
}
