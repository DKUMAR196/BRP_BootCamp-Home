package com.bridgelabz.try_catch;

public class TestFinally03 {
	public static void main(String[] args) {
		try {
			int a = 100, b = 2, c;
			c = a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("I am finally block..!!");
		}
		System.out.println("When Exception is not occurs, than" 
				+" finally block is always exicute..!!" );
	}
}
