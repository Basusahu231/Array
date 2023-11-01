package com.Pratice.java;
import java.util.*;
public class program6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int[scan.nextInt()];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	int sear = scan.nextInt();
	for(int i =0; i<=arr.length-1; i++)
	{
		if(sear ==arr[i])
		{
			System.out.println("Element is present ");
			return;
		}
	
			}
	System.out.println("Element is not present");

	
}
}
