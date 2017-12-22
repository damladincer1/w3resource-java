package com.damladincer.w3resource.basic;

/**
 * Write a Java program to check if a positive number is a palindrome or not
 * 
 * @author damla
 */
import java.util.Scanner;

public class Question115 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String number = scan.nextLine();
		boolean palindrome = false;

		palindrome = isPalindrome(number);
		System.out.println(palindrome);
		scan.close();
	}

	private static boolean isPalindrome(String number) {
		int length = number.length();
		boolean palindrome = true;
		int i = 0;
		int j = length - 1;
		while (i < j) {
			if (number.charAt(i++) != number.charAt(j--)) {
				palindrome = false;
				break;
			}
		}

		return palindrome;
	}
}