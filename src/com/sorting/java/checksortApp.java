package com.sorting.java;
import java.util.*;
public class checksortApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// taking array  length  from user input
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	// taking array element from user input
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]= scan.nextInt();
	}
	// calling not static method from different  class
	boolean sort = checkSort.checkSort(arr);
	// if sort is equal to true then Array is sorted 
 if(sort == true)
{
	System.out.println("Array is sorted");
	
}
 // if array is equal to false then array is not sorted
else
{
	System.out.println("Array is not sorted");
}
} 
}
