package com.bridgelabz.program_day01;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");

        int size;
        size = cs.nextInt();
        String names[] = new String[size];
        System.out.println("Enter elements of an array: ");

        for (int i=0;i<size;i++)
        {
            names[i]= cs.nextLine();
        }
        System.out.println("After the reverse of an array is: ");
        for (int i=size-1;i>=0;i--)
            System.out.print(" " +names[i]+ " ");		
	}
}
