package com.javaProjectDay3;
import java.util.Scanner;

class PrintArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array: ");  
        //Loop through the array by incrementing value of i  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
