package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * V2: Write a Java program that prints N increasing adjacent numbers
 * printAdjacentNumbers(numberArray, n)
 * 
 * Example: { 20, 30, 22, 21, 56, 23, 58, 43, 89, 57, 90 };
 * printAdjacentNumbers(numberArray, 4) prints 20-21-22-23
 * 
 * @author damla
 *
 */
public class Question107v2 {

	public static void main(String[] args) {
		int[] numbers = { 20, 30, 22, 24, 56, 23, 58, 43, 21, 91, 65, 98, 94 };
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your adjacent length to compute : ");
		int length = scan.nextInt();
		int[] finalNumbers = new int[length];
		finalNumbers = adjacentNumbers(numbers, length);
		for (int i = 0; i < length; i++) {
			System.out.print(finalNumbers[i] + " ");
		}
		scan.close();
	}

	private static int[] adjacentNumbers(int[] numbers, int length) {
		numbers = sortArray(numbers);
		int[] finalArray = new int[length];
		int count = 0;

		for (int i = 0; i < numbers.length; i++) {
			if ( numbers[i + 1]-numbers[i]==1) {
				finalArray[count++] = numbers[i];
			}if(count==length) {
				break;
			}
		}
		return finalArray;
	}

	public static int[] sortArray(int[] arrayFinal) {
		for (int i = 0; i < arrayFinal.length; i++) {
			for (int j = 0; j < arrayFinal.length - 1; j++) {
				if (arrayFinal[j] > arrayFinal[j + 1]) {
					int temp = arrayFinal[j + 1];
					arrayFinal[j + 1] = arrayFinal[j];
					arrayFinal[j] = temp;
				}
			}
		}
		return arrayFinal;
	}

}
