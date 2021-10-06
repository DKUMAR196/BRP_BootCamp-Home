package com.bridgelabz.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI01 {
	public static void main(String[] args) {
		
//		Create a list of string using stream 
		Stream<String> stream = Stream.of("Deepak", "Kumar", 
				"Name", "chottu", "Prem", "Sagar" );
//		stream.forEach(s->System.out.println(s));
//		stream.forEach(System.out::println);
		System.out.println(stream.collect(Collectors.toList()));
	}
}
