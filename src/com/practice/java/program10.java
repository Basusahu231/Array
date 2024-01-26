package com.practice.java;
import java.util.*;
public class program10 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int[scan.nextInt()];
	System.out.println("Enter the element of array ");
	for(int i =0; i<arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Array before Descending order");
	for(int x: arr)
	{
		System.out.print(x + " " );
	}
	System.out.println();
	for(int i =0; i<=arr.length-2; i++)
	{
		for(int j =0; j<=arr.length-2-i; j++)
		{
			if(arr[j]<arr[j+1])
			{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("Array After Descending order");
	for(int y: arr)
	{
		System.out.print(y + " ");
	}
}
}
