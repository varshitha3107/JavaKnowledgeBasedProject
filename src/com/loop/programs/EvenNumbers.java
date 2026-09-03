package com.loop.programs;
import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		
		int num = scanner.nextInt();
		
		while(num <= 20) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}
		scanner.close();
	}

}
