package com.javaProjectDay3;

import java.util.Scanner;

public class OddArray {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		oddArray();
	}

	private static void oddArray() {
		// TODO Auto-generated method stub

		// Take input from the user
		Scanner sc = new Scanner(System.in);

		int n; // Declare size of an array
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt(); // Intialize the array size

		int arr[] = new int[n]; // Declare an array
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt(); // Initialize the array elements
		}

		// Print the odd elements
		System.out.println("The Odd Elements are...");
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 != 0) // check whether odd or not
			{
				System.out.print(arr[i] + " ");
			}
		}

	}

}
