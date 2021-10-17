package com.bridgelabz.try_catch;

public class TestFinally {
	public static void main(String[] args) {
		try {
			int a = 100, b = 2, c;
			c = a/b;
			System.out.println(c);

		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I am finally block..!!");

		}
		System.out.println("When Exception is not occurs, than CATCH block is "
				+ "not exicute ," +" BUT finally block is always exicute..!!");			
	}
}
