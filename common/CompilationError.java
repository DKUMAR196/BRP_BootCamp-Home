package com.bridgelabz.program.common;

public class CompilationError {
	CompilationError(int i){
		System.out.println("1-args const");
	}
	public static void main(String[] args) {
//		CompilationError ce = new CompilationError();
		CompilationError ce1 = new CompilationError(10);		
	}
}
