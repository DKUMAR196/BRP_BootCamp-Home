package com.bridgelab.program.basic;

public class CreateObject {
	int id;
	String name;
	void insetData(int i, String s) {
		id= i;
		name = s;
	}
	 void displayData()
	{
		System.out.println(+id+ " "  + "name");
	}
	public static void main(String[] args) {
//		creating obj of the class is CreateObject
		CreateObject co = new CreateObject();
//		insertData in the method
		co.insetData(100, "Deepak");
		co.displayData();
	}
}
