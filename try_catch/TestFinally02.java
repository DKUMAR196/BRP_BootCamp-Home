package com.bridgelabz.try_catch;

public class TestFinally02 {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("I am finally block..!!");
		}
		System.out.println("When Exception is occurs, than" +" finally block is always exicute..!!"
				+"but CATCH block is "
				+ "not prasent Exception does not handdle without catch block than"
				+ "Exception is throw," );
	}
}
