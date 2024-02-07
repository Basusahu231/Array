package com.sorting.java;
import java.util.*;
public class myApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the length of array ");
		int [] arr = new int [scan.nextInt()];
		System.out.println("enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Press 1  to check whether  array is sorted or not  ");
		System.out.println("Press 2  to perform linear search   ");
		System.out.println("Press 3  to perform binary search   ");
		System.out.println("Press 4  to  sort an array using bubble sort   ");
		System.out.println("Press 4  to  sort an array using insertion sort   ");
		System.out.println("Press 5  to  sort an array using selection  sort   ");
		System.out.println("Press 6  to print minimum element in array  ");
		System.out.println("Press 7  to print maximum element in array   ");
		System.out.println("Press 8  to check whether  array is sorted or not  ");
		System.out.println("Enter a number");
		int num = scan.nextInt();
		switch(num);


	}
}
