package com.bridgelabz.program.common;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentInFo {
	@Override
	public String toString() {
		return "StudentInFo [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public StudentInFo() {

	}

	public StudentInFo(int id, String firstName, String lastName, String gender, String mobileNumber) {		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobileNumber = mobileNumber;		
	}

	private  int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNumber;
	Scanner in = new Scanner(System.in);

	//	void inserData(int i, String fN, String lN, String g, String mN) {
	//		id = i;
	//		firstName = fN;
	//		lastName = lN;
	//		gender = g;
	//		mobileNumber = mN;		
	//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Please enter the id of the students ");
		id = in.nextInt();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("Please enter the first name of the students");
		firstName = in.nextLine();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("Please enter the last name of the students");
		lastName = in.nextLine();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Please enter the gender of the students");
		gender = in.nextLine();
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		System.out.println("Please enter the mobile number  of the students");
		mobileNumber = in.nextLine();
	}

	public static void main(String[] args) {
		List<StudentInFo> list = new ArrayList<>();
		StudentInFo st = new StudentInFo();
		Scanner in = new Scanner(System.in);
		System.out.println("  ");
		System.out.println("Enter 1 Register yourself");
		System.out.println("Enter 2 Check your info");
		System.out.println("Enter 3 No more Students");
		System.out.println("  ");
		int choice = in.nextInt();

		switch(choice) {			
		case 1:
			StudentInFo  std = new StudentInFo (1, "Deepak", "Kumar", "Male", "8503987671");
			list.add(std);
			System.out.println(list);
			break;

		case 2:
			Iterator <StudentInFo> itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				break;
			}
		}
	}
}   
