package com.javaknowledgebasedproject;

public class ReverseNumbere {

	public static void main(String[] args) {
		int num = 12345;
		int reverse = 0;
		do {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		} while (num != 0);
		System.out.println(reverse);
	}
}
 