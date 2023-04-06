package com.javaProjectDay3;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       dupliCate();
        
	}

	private static void dupliCate() {
		// TODO Auto-generated method stub
		
		// Take input from the user
		
		 
		Scanner sc = new Scanner(System.in);
		
		int count;
		System.out.println("Enter the size of the array: ");
		count = sc.nextInt(); // Intialize the array size
		
		int [] arr  = new int[count];
		System.out.println("Enter the array Elements : ");
		for(int i=0; i < count; i++) {
			
			arr[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<count; i++) {
			if (arr[i] > max)
				max =arr[i];
		}
		
		int brr[] = new int[max + 1];
		for (int i=0; i < count; i++) {
			
			 // increment in array brr for every integer in arr. 
            brr[arr[i]]++; 	
		}
		
        System.out.println("Element  Frequency ");
       for (int i = 0; i <= max; i++) { 
           // output only if element is more than 1 time in array A. 
           if (brr[i] > 1) 
               System.out.println("   " + i + "        " + brr[i]); 
       } 
		
	}
}
