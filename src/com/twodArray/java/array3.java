package com.twodArray.java;
import java.util.*;
public class array3 {
	public static void main(String[] args) {
		// taking user input
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the length of array");
	// creation of array
	int [] arr = new int [scan.nextInt()];
	//storing the value in array
	for(int i =0; i<=arr.length-1; i++)
	{
	arr[i] = scan.nextInt();
	}
	// retriving the value in array
	for(int i =0; i<=arr.length-1; i++)
	{
		if(i%2==0)
		{
			System.out.println(arr[i]);
		}
		
	}
	}
}
