package com.bridgelabz.program_day03;

import java.util.Scanner;

public class WindChill {
	static void takeInputs() {
		double t = 2.0; 
        double v = 2.0;
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
		
	}
	
	public static void main(String[] args) {
		takeInputs();
    }
}
