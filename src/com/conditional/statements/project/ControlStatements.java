package com.conditional.statements.project;
import java.util.Scanner;
public class ControlStatements {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		int marks = scanner.nextInt();
		System.out.println("Output: ");
		if(marks < 0 || marks > 100) {
			System.out.println("Invalid Marks");
			scanner.close();
			return;
		}
		
		if(marks >= 90) {
			System.out.println("Grade: A");
			
			if(marks >= 95) {
				System.out.println("Excellent!");
			}else {
				System.out.println("Great job!");
			}
		}else if(marks >= 75) {
			System.out.println("Grade: B");
			
			if(marks >= 85) {
				System.out.println("Well Done!");
			}else {
				System.out.println("Good Effort!");
			}
		}else if(marks >= 60) {
			System.out.println("Grade: C");
			
			if(marks >= 68) {
				System.out.println("Satisfactory!");
			}else {
				System.out.println("Keep pushing!");
			}
		}else if(marks >= 40) {
			System.out.println("Grade: D");
			
			if(marks >= 50) {
				System.out.println("Passed!");
			}else {
				System.out.println("Needs Improvement!");
			}
		}else {
			System.out.println("Grade: F");
			
			if(marks >= 20) {
				System.out.println("Need Improvement");
			}else {
				System.out.println("Hard work requires");
			}
		}
		scanner.close();
	}

}
