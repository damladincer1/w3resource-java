package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program to capitalize the first letter of each word in a
 * sentence. Go to the editor Sample Output:
 * 
 * Input a Sentence: the quick brown fox jumps over the lazy dog. The Quick
 * Brown Fox Jumps Over The Lazy Dog.
 * 
 * @author damla
 *
 */
public class Question58 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] words = input.split(" ");

		for (int i = 0; i < words.length; i++) {
			String last = words[i].substring(1);
			String upperCase = words[i].toUpperCase();

			words[i] = upperCase.charAt(0) + last;
		}

		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i] + " ");
		}
		scan.close();
	}

}
