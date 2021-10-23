package com.bridgelabz.lambda;

// Create Functional Interface
@FunctionalInterface
interface ThisInterface {
	//	Only one abstract method they have not method body
	//	public abstract int sumInt(int a, int b);
	public abstract int subInt(int a, int b);
}

public class Operation implements ThisInterface{
	public int sumInt(int a, int b){
		//		System.out.println("Sum of two number " +a+ " & " +b+  " = " +(a+b));
		return a+b;
	}

	public int subInt(int a, int b ) {
		System.out.println("Substraction of two number is "+a+ " & " +b+ " = "+(a-b));
		return a-b;
	}

	public static void main(String[] args) {
		Operation op = new Operation();
		//		op.sumInt(3, 4);
		//		op.subInt(6, 2);

		//		Using lambda expression

		//		ThisInterface sum = (a, b)->a+b;
		//		System.out.println(sum.sumInt(2, 2));

		ThisInterface sub = (a,b)->a-b;
		System.out.println("Substraction of two number is "+sub.subInt(8, 5));
	}
}
