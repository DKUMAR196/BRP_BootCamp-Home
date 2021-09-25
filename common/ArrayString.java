package com.bridgelabz.program.common;

public class ArrayString {
	public boolean arrayStringEqual(String[] word1, String[] word2) {
		String firstWord = " ";
		String secondWord = " ";
		for(int i= 0; i<word1.length; i++) {
			firstWord = firstWord + word1[i];
		}

		for(int i = 0; i<word2.length; i++) {
			secondWord = secondWord + word2[i];
		}

		if(firstWord.equals(secondWord)) {
			return true;
		}
		return false;
	}
}
