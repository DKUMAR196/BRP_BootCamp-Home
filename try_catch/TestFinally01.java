package com.bridgelabz.try_catch;

public class TestFinally01 {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a/b;
			System.out.println(c);

		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am finally block..!!");

		}
		System.out.println("When Exception is occurs, than CATCH block is "
				+ "exicute," +" BUT finally block is always exicute..!!");
	}
}
