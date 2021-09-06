package com.bridgelabz.program_day04;

public class Trigonometric {
	static void trigOperations() {
		double degrees = 30; 
	    double radians = 20; 

	    double s = Math.sin(radians);
	    System.out.println("sin(" + degrees + ") = " + s);

	    double c = Math.cos(radians);
	    System.out.println("cos(" + degrees + ") = " + c);

	    double t = Math.tan(radians);
	    System.out.println("tan(" + degrees + ") = " + t);
	    System.out.println(s + " / " + c + " = " + s / c);

	    double r = s*s + c*c;
	    System.out.println(s*s + " + " + c*c + " = " + r);		
	}
	
	public static void main(String[] args) {
		trigOperations();
	}
}
