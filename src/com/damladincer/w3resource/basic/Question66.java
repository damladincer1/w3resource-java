package com.damladincer.w3resource.basic;

/**
 * Write a Java program to compute the sum of the first 100 prime numbers. Go to
 * the editor Sample Output:
 * 
 * Sum of the first 100 prime numbers: 24133
 * 
 * @author damla
 *
 */
public class Question66 {

	public static final int EXPECTED = 100;

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int i = 2;
				
		while (count < EXPECTED) {
			if (isPrime(i)) {
				count++;
				printPrimeNumber(i);
				sum += i;
			} i++;
			
		}
		System.out.println("The sum of prime numbers between 1 and 100 is: " + sum);
	}

	private static void printPrimeNumber(int i) {
		System.out.println(i);
	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < (number / 2) + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
