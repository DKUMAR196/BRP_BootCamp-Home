package com.bridgelabz.program_saturdaydrive;

public class DuplicateWord {
	public static void main(String args) {
		String string = " Big black bug bit a black dog on big black ";
		int count;

		string = string.toLowerCase();
		String words[] = string.split(" ");
		System.out.println("Dupticate word in a string...:");
		for(int i = 0; i<words.length;i++) {
			count = 1;
			for(int j = i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;

					words[j] = "0";
				}
			}
			if(count>1 && words[i]!="0") {
				System.out.println(words[i]);
			}
		}
	}
}
