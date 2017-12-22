package com.damladincer.w3resource.basic;

/**
 * Write a Java program to create and display unique three-digit number using 1,
 * 2, 3, 4. Also count how many three-digit numbers are there.
 * 
 * @author damla
 *
 */
public class Question39 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		int length = numbers.length;
		int permutation = permutation(length);

		System.out.println("There are " + permutation + " possibilities in here.");
		printAllPossibilities(numbers, length, permutation);
		
	}

	private static void printAllPossibilities(int[] numbers, int length, int permutation) {
		for (int i = 0; i < length; i ++) {
			for (int j = 0; j < length; j++) {
				for (int n = 0; n < length; n++) {
					if (numbers[i] != numbers[j] && numbers[j] != numbers[n]) {
						System.out.println(+numbers[i]+""+numbers[j]+""+numbers[n]);
					}
				}
			}
		}
	}

	public static int permutation(int length) {
		int permutation = 1;
		if (length == 1) {
			return permutation;
		} else {
			permutation *= length * permutation(length - 1);
		}
		return permutation;
	}

}
