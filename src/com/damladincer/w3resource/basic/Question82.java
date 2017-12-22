package com.damladincer.w3resource.basic;

/**
 * Write a Java program to find the largest element between first, last, and
 * middle value from an array of integers (odd length). Go to the editor Sample
 * Output:
 * 
 * Original Array: [20, 30, 40, 50, 67] Largest element between first, last, and
 * middle values: 67
 * 
 * @author damla
 *
 */
public class Question82 {

	public static void main(String[] args) {
		int[] numbers = { 90, 30, 18, 50, 67 };
		int max = numbers[0];
		int middle = numbers[numbers.length / 2];
		int last = numbers[numbers.length - 1];
		if (middle > max) {
			max = middle;
		} else if (last > max) {
			max = last;
		}
		System.out.println(max);
	}

}
