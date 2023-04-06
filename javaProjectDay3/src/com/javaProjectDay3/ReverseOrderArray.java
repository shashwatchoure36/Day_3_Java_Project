package com.javaProjectDay3;

import java.util.Scanner;

public class ReverseOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseArray();

	}

	private static void reverseArray() {
		// TODO Auto-generated method stub

		int i;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Size of Array: ");
		int num = scan.nextInt();
		int[] arr = new int[num];

		System.out.print("Enter " + num + " Elements for the Array: ");
		for (i = 0; i < num; i++)
			arr[i] = scan.nextInt();

		System.out.println("\nReverse of Given Array is: ");
		for (i = (num - 1); i >= 0; i--)
			System.out.print(arr[i] + " ");

	}

}
