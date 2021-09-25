package com.bridgelabz.program.common;

public class Test02 {
	void car() {
		System.out.println("This ia a car");
	}
	Test02(){
		System.out.println("0-args const");
	}
	Test02(int a){
		System.out.println("1-args const");
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		Test02 t1 = new Test02(10);
		t.car();
		t1.car();		
	}		
}

