package com.santhosh.practice.JavaPractice.basucPrograms;

public class AddEvenExamlpes {

	public static void main(String[] args) {

		// Find Odd OR Even
		oddOrEven(2);
		// Count the Odd numbers in given number
		countOfOdd(50);
		// Count the Even numbers in given number
		countOfEven(100);
		// Sum of the Even numbers in given number
		sumOfEven(5);
		// Sum of the Odd numbers in given number
		sumOfOdd(5);
	}

	private static void sumOfEven(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum of Even number in " + num + " is " + sum);
	}

	private static void sumOfOdd(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("Sum of Odd number in " + num + " is " + sum);
	}

	private static void countOfEven(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				count++;
			}
		}
		System.out.println("Count of Even number in " + num + " is " + count);
	}

	private static void countOfOdd(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("Count of Odd number in " + num + " is " + count);
	}

	private static void oddOrEven(int num) {
		if (num <= 0) {
			System.out.println("Enter the number Greater than 0");
		} else if (num % 2 != 0) {
			System.out.println(num + " is Odd Number");
		} else {
			System.out.println(num + " is Even Number");
		}
	}

}
