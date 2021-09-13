package com.bridgelabz.program_day08;

import java.util.Scanner;

public class Anagram {
	static void findAnagram(String str1, String str2){	 
		int len, len1, len2, i, j, found=0, not_found=0;
		len1 = str1.length();
		len2 = str2.length();

		if(len1 == len2)
		{
			len = len1;
			for(i=0; i<len; i++)
			{
				found = 0;
				for(j=0; j<len; j++)
				{
					if(str1.charAt(i) == str2.charAt(j))
					{
						found = 1;
						break;
					}
				}
				if(found == 0)
				{
					not_found = 1;
					break;
				}
			}
			if(not_found == 1)
			{
				System.out.print("Strings are not Anagrams");
			}
			else
			{
				System.out.print("Strings are Anagrams");
			}
		}
		else
		{
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}
	
	public static void maim(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second String : ");
		String str2 = sc.nextLine();
		sc.close();
		findAnagram(str1,str2);
	}
}
