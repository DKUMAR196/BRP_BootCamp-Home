package com.bridgelabz.program.common;

interface Operation
{
     int a = 50;
     int b = 30;
     void add(int a, int b);
     void sub(int a, int b);
}
public class DifferentOperations implements Operation {
//	public void add()
//    {
//         System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
//    }
//	
//    public void sub()
//    {
//         System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
//    }
//	

	public static void main(String[] args) {		
		DifferentOperations op = new DifferentOperations();
		op.add(a,b);
		op.sub(a,b);		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("addition of "+a+" and "+b+" is :"+(a+b));		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtraction of "+a+" and "+b+" is :"+(a-b));		
	}
}
