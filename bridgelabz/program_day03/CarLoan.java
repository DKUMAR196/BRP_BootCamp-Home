package com.bridgelabz.program_day03;

public class CarLoan {
	static void insertData() {
		double principal = 20000.0 ;
        double years = 5.0 ;
        double rate = 6.0 ;

        double r = (rate / 100) / 12;   // monthly interest rate
        double n = 12 * years;          // number of months

        double payment  = (principal * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principal;

        System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
	}
	
	public static void main(String[] args) {
		insertData();		
	}
}
