package com.twodArray.java;
import java.util.*;
public class arrayReplace {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
// creation of array
	int [] arr = new int [scan.nextInt()];
	// storing the value in array
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
		
	}
	System.out.println("original array is :");
	// printing the value in array
	for(int x:arr)
	{
		System.out.println(x);
	}
// if number is divisble by 3 then repalce with -1	
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]%3==0)
		{
			System.out.println(-1+ " ");
		}
			else
		{
			System.out.println(arr[i]);
		}
		System.out.println("modified array is :");

		
	
	}
}
}
