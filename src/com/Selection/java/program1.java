package com.Selection.java;
import java.util.*;
public class program1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array ");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]= scan.nextInt();
	}
	System.out.println("Array before sorting : ");
	for(int x: arr)
	{
		System.out.println(x);
	}
	int min ;
	int temp=0;
	for(int i =0; i<=arr.length-1; i++)
	{
		min =i;
		for(int j =i+1; j<=arr.length-1; j++)
		{
			if(arr[j]<arr[min])
			{
				min = j ;
			}
		}
		temp=arr[i];
		arr[i]= arr[min];
		arr[min]= temp;
	}
	System.out.println("Array after sorting :");
	for(int x : arr)
	{
		System.out.println(x);
	}
}
}
