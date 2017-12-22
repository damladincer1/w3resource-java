package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program to find the number of integers within the range of two
 * specified numbers and that are divisible by another number. Go to the editor
 * For example x = 5, y=20 and p =3, find the number of integers within the
 * range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
 * Sample Output:
 * 
 * 5
 * 
 * @author damla
 *
 */
public class Question56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter x :");
		int x = scan.nextInt();
		System.out.println("Please enter y :");
		int y = scan.nextInt();
		System.out.println("Please enter the mod :");
		int p = scan.nextInt();

		int numbers = findNumbers(x, y, p);
		System.out.println("There are " + numbers +" numbers divided by " +p);
		scan.close();
	}

	private static int findNumbers(int x, int y, int p) {
		int count = 0;
		for (int i = x; i <= y; i++) {
			if (i%p==0) {
				count++;
			}
		}
		return count;
	}
}