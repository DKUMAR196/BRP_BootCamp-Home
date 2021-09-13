package com.bridgelabz.program.common;

import java.util.Scanner;

public class Digits {
	public static void operation(int number) {
		int remainder, temp, sum=0, product=1;
		  temp = number;
		  float result = 1.0f;
		  while (temp!=0)
		  {
			  remainder = (temp % 10);
			  sum = (sum + remainder);
			  product = (product * remainder);			  
			  temp = (temp / 10);
			  result = (product-sum);
		  }
		  System.out.println("Sum of digits of Number '"+number+"'': "+sum);
		  System.out.println("Product of digits of Number '"+number+"'': "+product);
		  System.out.println("Result of digits of Number '"+number+"'': "+result);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Digits Sum and Product");
		  System.out.println("-------------");
		  System.out.print("Enter Number: ");
		  int number = sc.nextInt();
		  sc.close();
		  operation(number);		  
	}
}


