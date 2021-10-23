package com.bridgelabz.lambda;

public class Parent {
	int a = 10;
	int b = 20;
}
class Child extends Parent{
	int a = 100;
	int b = 200;
	void add(int a , int b) {
		System.out.println("Add of two number is "+(a+b));
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.add(20, 30);
	}
}
