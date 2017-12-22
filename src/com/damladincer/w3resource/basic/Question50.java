package com.damladincer.w3resource.basic;

/**
 * Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
 * @author Asus
 *
 */
public class Question50 {

	public static final int NUMBERS_END = 100;
	public static final int NUMBER_1 = 3;
	
	public static void main(String[] args) {
		
		int[] divisibleByThree = new int[NUMBERS_END / NUMBER_1];
		int[] divisibleByFive = new int[NUMBERS_END];
		int[] divisibleByThreeAndFive = new int[NUMBERS_END];
		
		int j = 0;
		int k = 0;
		int n = 0;
		for (int i = 1; i < NUMBERS_END; i++) {
			if (i % NUMBER_1 == 0 || i % 5 == 0) {
				if (i % NUMBER_1 == 0 && i % 5 == 0) {
					divisibleByThreeAndFive[j] = i;
					divisibleByThree[k] = i;
					divisibleByFive[n] = i;
					j++;
					k++;
					n++;
				} else if (i % NUMBER_1 == 0) {
					divisibleByThree[k] = i;
					k++;
				} else if (i % 5 == 0) {
					divisibleByFive[n] = i;
					n++;
				}
			}
		}
		System.out.print("Divisible by : " + NUMBER_1);
		for (int i = 0; i < divisibleByThree.length; i++) {
			if (divisibleByThree[i] != 0) {
				System.out.print(divisibleByThree[i]);
				System.out.print(",");
			} else {
				break;
			}
		}
		System.out.println();
		System.out.print("Divisible by 5: ");
		for (int i = 0; i < divisibleByFive.length; i++) {
			System.out.print(divisibleByFive[i]);
			System.out.print(",");
		}
		System.out.println();
		System.out.print("Divisible by " + NUMBER_1 + " and 5: ");
		for (int i = 0; i < divisibleByThreeAndFive.length; i++) {
			System.out.print(divisibleByThreeAndFive[i]);
			System.out.print(",");
		}
	}
}