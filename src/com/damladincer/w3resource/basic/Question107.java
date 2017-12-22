package com.damladincer.w3resource.basic;

/**
 * Write a Java program to check if an array of integers contains three
 * increasing adjacent numbers.
 * 
 * 
 * V2: Write a Java program that prints N increasing adjacent numbers
 * printAdjacentNumbers(numberArray, n)
 * 
 * Example: { 20, 30, 22, 21, 56, 23, 58, 43, 89, 57, 90 };
 * printAdjacentNumbers(numberArray, 4) prints 20-21-22-23
 * 
 * @author damla
 *
 */
public class Question107 {

	public static void main(String[] args) {
		boolean isTrue = false;
		int[] numbers = { 20, 30, 22, 21, 56, 65, 58, 43, 89, 57, 90 };
		isTrue = isAdjacentNumberExist(numbers);
		System.out.println(isTrue);
	}

	public static boolean isAdjacentNumberExist(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				for (int k = 0; k < numbers.length; k++) {
					if (numbers[j] == numbers[i] + 1 && numbers[j] == numbers[k] - 1) {
						System.out.print(numbers[i] + "-");
						System.out.print(numbers[j] + "-");
						System.out.println(numbers[k]);
						return true;
					}
				}
			}

		}
		return false;
	}
}
