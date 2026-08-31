package com.constructor.programs;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee() {
		id = 101;
		name = "Nausheen";
		salary = 35000.00;
	}
	
	public Employee(int i, String n, double s) {
		id = i;
		name = n;
		salary = s;
	}
	
	void display() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: " +name);
		System.out.println("Employee Salary: "+salary);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee(101,"Varshitha",30000.00);
		e2.display();
	}

}
