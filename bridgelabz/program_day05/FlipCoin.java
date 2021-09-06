package com.bridgelabz.program_day05;

import java.util.Scanner;

public class FlipCoin {
	static void flipCoin(int flip) {
		int count=0,count1=0,coin=0,temp=0;
		temp=flip;
		while(flip!=0) {
			coin = (int) Math.floor(Math.random()*2);
			if(coin == 1) {
				count++;
			}else {
				count1++;
			}
			flip--;
		}		
		System.out.println(count);
		System.out.println(count1);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Filp you want");
		int flip = sc.nextInt();
		flipCoin(flip);
	}
}
