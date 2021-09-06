package com.bridgelab.program.common;

import java.util.Scanner;

public class FindSingleRep {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an array: ");
//		int[] a = sc.nextInt();
		
		int[] a = {1,2,4,1,2};//4 = 100, 1 = 001{1^0 =1, 0^0=0, 0^1=1, 1^1=0}
		int result = a[0];
		for(int i =1; i<a.length;i++)
		{
			result=result^a[i];
		}
		System.out.println("single repeated elements is: "+result);
	}
}
