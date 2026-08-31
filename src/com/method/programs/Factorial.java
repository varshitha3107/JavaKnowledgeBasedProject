package com.method.programs;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input: ");
		
		int n = scanner.nextInt();
		
		System.out.println("Factorial is: " +factorial(n));
		scanner.close();
	}

	public static int factorial(int n) {
		 
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

}
