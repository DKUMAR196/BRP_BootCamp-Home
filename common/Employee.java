package com.bridgelabz.program.common;

public class Employee {
	private String name;  
	private String id;  
	private double sal;  
	public String getName() {  
		return name;  
	}  
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getId() {  
		return id;  
	}  
	public void setId(String id) {  
		this.id = id;  
	}  
	public double getSal() {  
		return sal;  
	}  
	public void setSal(double sal) {  
		this.sal = sal;  
	}  

	public static void main(String[] args) {    
		Employee obj= new Employee();  
		obj.setName("Deepak");   
		obj.setId("D001");  
		obj.setSal(200000);  
		System.out.println("Name: "+ obj.getName()); 
		System.out.println("Id: " + obj.getId());  
		System.out.println("Salary: " +obj.getSal());  
	}  
}  
