package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program and compute the sum of the digits of an integer.
 * 
 * @author damla
 *
 */
public class Question33 {

	public static void main(String[] args) {
		int totalCount = 0;
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int[] numbersIncluded = new int[100];
		String number = scan.nextLine();
		if(!number.matches(".*[a-z].*") ) {
			for (int i = 0; i < number.length(); i++) {
				numbersIncluded[i] = number.charAt(i)-'0';
				totalCount += numbersIncluded[i];
			}
		} else {
			System.out.println("Only number can accept!");
			System.out.println("Please enter a valid number !");
		}  
		System.out.println("The sum of the digits is: "+totalCount);
		scan.close();
	}
}
