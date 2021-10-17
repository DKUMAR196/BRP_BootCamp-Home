package com.bridgelabz.try_catch;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException{
	YoungerAgeException(String msg){
		super(msg);
	}
}
class Voting{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		if(age<18) {
			throw new YoungerAgeException("You are not eligible for voting:");		
		}else {
			System.out.println("You can vote successfully:");
		}
	}
}
