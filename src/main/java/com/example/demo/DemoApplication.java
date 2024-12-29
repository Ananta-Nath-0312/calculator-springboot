package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Choose option:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();
		System.out.println("Number one: ");
		double num1 = scanner.nextDouble();
		System.out.println("Number two: ");
		double num2 = scanner.nextDouble();

		double result;

		switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println(result);
				break;

			case 2:
				result = num1 - num2;
				System.out.println(result);
				break;

			case 3:
				result = num1 * num2;
				System.out.println(result);
				break;

			case 4:
				result = num1 / num2;
				System.out.println(result);
				break;

			default:
				System.out.println("Invalid choice");
				;
				break;
		}
		scanner.close();
	}
}
