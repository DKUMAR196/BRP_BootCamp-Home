package com.bridgelabz.program_day02;

import java.util.Scanner;

public class Distance {
	static void findDistance(int x1,int x2,int y1,int y2) 
	{		
		double distance;				
		distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("Distance Between"+"("+x1+","+y1+"),"
				            + " "+"("+x2+","+y2+")===>"+distance);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vale of x1; ");
		int x1 = sc.nextInt();
		
		System.out.println("Enter the vale of x2; ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter the vale of y1; ");
		int y1 = sc.nextInt();
		
		System.out.println("Enter the vale of y2; ");
		int y2 = sc.nextInt();
		findDistance(x1,x2,y1,y2);				
	}
}
