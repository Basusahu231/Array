package com.bubbleSort.java;
import java.util.*;
public class program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// taking length of array 
		System.out.println("Enter the length of array");
		int [] arr  = new int [scan.nextInt()];
		// entering the element of array 
		System.out.println("Enter the element of array : ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]= scan.nextInt();
		}
		// array before sorting 
		System.out.println("Array before sorting are : ");
		for(int x: arr)
		{
			System.out.println(x);
		}
		// taking temp variable for swapping the element
		int temp=0;
		// this loop is for no. of round 
		for(int i =0; i<=arr.length-1; i++)
		{
			// this loop is for swapping of element 
			for(int j=0; j<=arr.length-2-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1]= arr[j];
					arr[j]= temp;
				}
			}
		}
		// element after swapping 
		System.out.println("Array after sorting are : ");
		for(int y : arr)
		{
			System.out.println(y);
		}
	}
}
