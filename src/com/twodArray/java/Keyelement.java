package com.twodArray.java;
import java.util.*;
public class Keyelement {
public static void main(String[] args) {
	// taking user input
	Scanner scan = new Scanner(System.in);
	//  enter the length of array
	System.out.println("enter the length of array");
	int [] arr = new int [scan.nextInt()];
	// enter the element of array
	System.out.println("enter the element ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]= scan.nextInt();
	}
	// enter the key element
	System.out.println("enter the key element ");
	int key =scan.nextInt();
	for(int i=0; i<=arr.length-1;i++)
	{
		if(arr[i]==key);
		{
			System.out.println("key found");
//		System.exit(0);
			return;
		}
	}
		System.out.println("key  not found");
}	
	
	}
		
		
	


