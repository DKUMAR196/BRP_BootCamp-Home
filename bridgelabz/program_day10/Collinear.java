package com.bridgelabz.program_day10;

import java.util.Scanner;

public class Collinear {
	public static String collinear(int x1,int x2,
			int x3,int y1,int y2,int y3)
	{
		int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3*(y1 -y2);
		if (a==0)
			System.out.println(" points are Colinear");
		else
			System.out.println(" points are not colinear");
		return " ";
	}

	public static void main(String args[])
	{
		int x1,x2,x3,y1,y2,y3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vale of x1,x2,x3,y1,y2,y3");
		x1 = sc.nextInt();
		x2=sc.nextInt();
		x3 = sc.nextInt();
		y1 = sc.nextInt();
		y2 = sc.nextInt();
		y3 = sc.nextInt();
		System.out.println(" "+x1+ " "+x2+ " "+x3+ " "+y1+ " "+y2+ " "+y3 );
		collinear(x1,x2,x3,y1,y2,y3);
	}
}
