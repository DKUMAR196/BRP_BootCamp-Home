package com.bridgelabz.stream;

import java.util.stream.Stream;

public class StreamObjects {
	public static void main(String[] args) {
		
//		Stream API - collection process
//		collection / group of object
		
//		1-blank[empty object created]
		Stream<Object> list = Stream.empty();
		
//		Array, object, collection
		String names[] = {"Deepak", "Kumar", "Raju", "PremSagar"};
		
//		Store string in a stream
		Stream<String> newList = Stream.of(names);
		newList.forEach(p->System.out.println(p));
	}
}
