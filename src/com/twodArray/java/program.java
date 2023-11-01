package com.twodArray.java;
import java.util.*;
public class program {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	float [] arr = new float [10];
	// storing the data
	for (int i = 0; i<=arr.length-1; i++)
	{
		System.out.println("enter the percentage of student" + (i+1));
		arr[i] = scan.nextFloat();
	}
	// Retreving the data
	for(int i =0; i<=arr.length-1; i++)
	{
		System.out.println("the percentage of student " + (i+1) + "is : " + arr[i]);
				
	}
}
}
