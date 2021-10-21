package com.bridgelabz.program_day01;

import java.util.Scanner;

public class PrintThreeNames {
	static String wordReverse(String str)
	{
	    int i = str.length() - 1;
	    int start, end = i + 1;
	    String result = "";
	     
	    while(i >= 0)
	    {
	        if(str.charAt(i) == ' ')
	        {
	            start = i + 1;
	            while(start != end)
	            result += str.charAt(start++);
	             
	            result += ' ';
	             
	            end = i;
	        }
	        i--;
	    }
	     
	    start = 0;
	    while(start != end)
	        result += str.charAt(start++);
	     
	    return result;
	   }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter The string... ");
         String str = sc.nextLine(); 
         System.out.print(wordReverse(str));
         sc.close();
	}
}
