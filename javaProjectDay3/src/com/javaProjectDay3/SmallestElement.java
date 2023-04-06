package com.javaProjectDay3;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count, min, i;
		int[] inputArray = new int[500];

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of elements");
		count = in.nextInt();
		System.out.println("Enter " + count + "elements");

		for (i = 0; i < count; i++) {
			inputArray[i] = in.nextInt();
		}

		min = inputArray[0];

		for (i = 1; i < count; i++) {

			if (inputArray[i] < min)
				min = inputArray[i];

		}

		System.out.println("Smallest Number : " + min);

	}

}
