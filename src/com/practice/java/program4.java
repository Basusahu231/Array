package com.practice.java;
import java.util.*;
public class program4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [5];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Enter the element which you want to find index");
	int key  = scan.nextInt();
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]==key)
		{
			System.out.println("Element " + arr[i] + " is present at index " + i);
		}
	}
}
}
