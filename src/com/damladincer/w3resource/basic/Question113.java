package com.damladincer.w3resource.basic;


/**
 * Write a Java program to merge two given sorted array of integers and create a
 * new sorted array. Go to the editor array1 = [1,2,3,4] array2 = [2,5,7, 8]
 * result = [1,2,2,3,4,5,7,8]
 * 
 * @author damla
 *
 */
public class Question113 {

	public static void main(String[] args) {
		int[] array1 = { 100, 200, 300, 400 };
		int[] array2 = { 2, 5, 7, 8 };
		mergeArrays(array1, array2);
	}

	private static void mergeArrays(int[] array1, int[] array2) {
		int[] arrayFinal = new int[array1.length + array2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < array1.length) {
			arrayFinal[k++] = array1[i++];
		}

		while (j < array2.length) {
			arrayFinal[k++] = array2[j++];
		}

		// NO USE THIS YET
		int[] sorted = new int[arrayFinal.length];
		sorted=sortArray(arrayFinal);
		// NO USE THIS YET

		for (int n = 0; n < sorted.length; n++) {
			if (n == sorted.length - 1) {
				System.out.print(sorted[n]);
			} else {
			System.out.print(sorted[n] + ","); // TODO Remove last comma
			}
		}
	}

	public static int[] sortArray(int[] arrayFinal) {
		for(int i = 0; i< arrayFinal.length;i++) {
			for(int j = 0; j<arrayFinal.length-1;j++) {
				if(arrayFinal[j]>arrayFinal[j+1]) {
					int temp = arrayFinal[j+1];
					arrayFinal[j+1]=arrayFinal[j];
					arrayFinal[j]=temp;
				}
			}
		}
		return arrayFinal;
	}

}
