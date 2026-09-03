package com.constructor.programs;

public class Student {

	String name;
	 int age;
	
	public Student() {
		name = "Nausheen";
		age = 23;
	}
	
	Student(String n, int a) {
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println("Name :" +name);
		System.out.println("Age: " + age);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println("Deafult constructor");
		s1.display();
		
		Student s2 = new Student("Varshitha", 20);
		System.out.println("Parameterized constructor");
		s2.display();

	}

}
