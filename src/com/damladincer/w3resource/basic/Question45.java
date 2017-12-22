package com.damladincer.w3resource.basic;

import java.io.File;

/**
 * Write a Java program to find the size of a specified file.
 * @author Asus
 *
 */
public class Question45 {

	public static void main(String[] args) {
		File file = new File("pg48023.txt");
		if (file.exists()) {
			if (file.isFile()) {
				double sizeInBytes = file.length();
				
				double sizeInKilobyte = sizeInBytes/1024.0;
				double sizeInMegabyte = sizeInKilobyte/1024.0;
				double sizeInGigabyte = sizeInMegabyte/1024.0;
				
				System.out.println("Size in Bytes: " +sizeInBytes);
				System.out.println("Size in Kilobytes: "+sizeInKilobyte);
				System.out.println("Size in Megabytes: "+sizeInMegabyte);
				System.out.println("Size in Gigabytes: "+sizeInGigabyte);
			}
		}
	}
}
