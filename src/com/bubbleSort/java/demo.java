package com.bubbleSort.java;
import java.util.*;
public class demo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [7];
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
				
	}
	for(int i =0; i<=arr.length-2; i++)
	{
		for(int j =0; j<=arr.length-i-2; j++)
		{
			if(arr[j]>arr[j+1])
			{
				 int temp = arr[j];
				 arr[j] = arr[j+1];
				 arr[j+1] = temp;
			}
		}
	}
	for(int i =0; i<=arr.length-1; i++)
	{
		System.out.println(arr[i]);
	}
}
}
