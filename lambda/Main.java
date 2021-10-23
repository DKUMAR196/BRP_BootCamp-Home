package com.bridgelabz.lambda;

public class Main {

	public static void main(String[] args) {
		System.out.println("My system start: ..");
//		MyInter mi = new MyInterImp();
//		mi.sayHello();
		
//   Using our interface with the help of lambda
		MyInter myinter = ()->System.out.println("This is first time"
				                                     + " i am using lambda");
		myinter.sayHello();
		
		SumInterface sum = (a,b)->a+b;
		System.out.println(sum.sum(2, 2));		
	}
}
