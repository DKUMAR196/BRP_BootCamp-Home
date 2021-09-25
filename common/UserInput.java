package com.bridgelabz.program.common;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		if(sc.hasNextInt()) {
			System.out.println(sc.nextInt()+" is valid Integer");
		}
		else
		{
			System.out.println(sc.nextLine()+" is valid String");
		}
		sc.close();
	}
}

