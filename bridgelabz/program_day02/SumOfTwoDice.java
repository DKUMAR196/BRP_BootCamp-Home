package com.bridgelabz.program_day02;

import java.util.Random;

public class SumOfTwoDice {
	public static void main(String[] args) {
//		Random dice = new Random();
//		int number;
//
//		for(int counter =1; counter<=10; counter++)
//		{
//			number =  dice.nextInt(6);
//		System.out.println(number+ " ");
//		}
		
		
		int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
        System.out.println(sum);
    }
}		

