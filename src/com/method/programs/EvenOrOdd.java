package com.method.programs;
import java.util.*;
public class EvenOrOdd {

	static int EvenOdd(int num) {
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is odd");
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = scanner.nextInt();
		EvenOdd(num);
	}

}
