package com.twodArray.java;

public class array {
public static void main(String[] args) {
	int multiply = 1;
	// creation of array
	int [] arr = {1,2,3,4,5};
	// storing the value in array
	for(int i=0; i<=arr.length-1; i++)
	{
		multiply *= arr[i];
	}
	// retriving the value in array
	System.out.println(multiply);
}
}
