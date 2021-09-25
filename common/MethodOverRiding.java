package com.bridgelabz.program.common;


// Creating a parent class
public class MethodOverRiding {
	void Show() 
	{
		System.out.println("one");
	}
}

// Creating a child class
	class Test extends MethodOverRiding{
//	Same method as in the parent class
		@Override
		void Show() 
		{
			System.out.println("Two");
		}			
				
	public static void main(String[] args) {
		MethodOverRiding mor = new MethodOverRiding();		
		mor.Show();
		
		Test02 t = new Test02();
//		t.Show();
	}	
}