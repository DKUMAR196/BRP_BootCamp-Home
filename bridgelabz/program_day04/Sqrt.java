package com.bridgelabz.program_day04;

import java.util.Scanner;

public class Sqrt {
	static void findSqrt() {
		double c1 = 2.01;
        double epsilon = 1e-15;  
        double t = c1;                    
        while (Math.abs(t - c1/t) > epsilon*t) 
        {
            t = (c1/t + t) / 2.0;
        }       
        System.out.println(t);
	}
	
	public static void main(String[] args) {
		findSqrt();		
	}
}

