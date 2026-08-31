package com.method.programs;
import java.util.*;
public class LargestNumbers {

	static int findLargest(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int b = scanner.nextInt();
		
		int result = findLargest(a, b);
		
		System.out.println("Largest number is : " + result);

	}

}
