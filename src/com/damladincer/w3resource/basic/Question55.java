package com.damladincer.w3resource.basic;

import java.util.Scanner;

/**
 * Write a Java program to convert seconds to hour, minute and seconds.
 * 
 * @author damla
 *
 */
public class Question55 {

	public static void main(String[] args) {
		System.out.println("Please enter seconds");
		Scanner scan = new Scanner(System.in);
		int seconds = scan.nextInt();

		int hour = seconds / 3600;
		int minute = (seconds - hour * 3600) / 60;
		int second = seconds - (minute * 60)-(hour*3600);

		System.out.println(hour + ":" + minute + ":" + second);
		scan.close();

	}

}
