package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program to count the letters, spaces, numbers and other
 * characters of an input string.
 * 
 * @author damla
 *
 */
public class Question38 {

	public static void main(String[] args) {
		System.out.println("Please enter a string: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int spaces = 0;
		int number = 0;
		int letter = 0;
		int others = 0;
		if (!input.isEmpty()) {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c==' ') {
					spaces++;
				} else if (Character.isDigit(c)) {
					number++;
				} else if (Character.isLetter(c)) {
					letter++;
				} else {
					others++;
				}
			} 
			System.out.println("Numbers: " + number);
			System.out.println("Letters: " + letter);
			System.out.println("Spaces: " + spaces);
			System.out.println("Others: " + others);
		} else {
			System.out.println("The string is empty.");
			System.out.println("Please enter a valid string");
		}
		scan.close();
	}
}
