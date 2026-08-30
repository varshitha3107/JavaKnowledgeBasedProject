package com.loop.programs;
import java.util.Scanner;
public class PrintNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input: ");
		
		int num = scanner.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println(i);
		}
	}

}
