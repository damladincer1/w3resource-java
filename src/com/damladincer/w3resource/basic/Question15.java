package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 * @author damla
 *
 */
public class Question15 {

	public static void main(String[] args) {
		System.out.println("Please enter a value of x : ");
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		int temp=0;

		System.out.println("Please enter a value of y : ");
		Scanner scan2 = new Scanner(System.in);
		int number2 = scan2.nextInt();

		temp = number2;
		number2 = number1;
		number1 =temp;

		System.out.println("x: " +number1 +" y: " +number2);
	scan1.close();
	scan2.close();
	}

}
