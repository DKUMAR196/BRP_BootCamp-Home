package com.bridgelabz.try_catch;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			int a=100, b=2, c;
			c = a/b;
			System.out.println("3");
			System.out.println(c);
			System.out.println("4");
		}catch(Exception e) {
			System.out.println("5");
			System.out.println(e);
			System.out.println("6");			
		}
		System.out.println("When Exception is not through than CATCH Block is not exicute!!");
	}
}
