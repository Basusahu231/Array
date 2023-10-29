package com.Pratice.java;
import java.util.*;
public class binarySearchApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key which to be searched");
	int key = scan.nextInt();
	 int [] array = binarySearch.sort(arr);
	 int [] array2 = binarySearch.binarySearch(arr, key);
	 for(int z :array2 )
	 {
		 System.out.println(z + " ");
	 }
	
}
}
