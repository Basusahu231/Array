package com.practice.java;
import java.util.*;
public class Program5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [4];
	System.out.println("Enter the element of array ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	System.out.println("Enter the index at which you want to insert element");
	int index  = scan.nextInt();
	System.out.println("Enter the element which you want to insert");
	int element  = scan.nextInt();
	for(int i = 0; i<=arr.length-1; i++)
	{
		if(index<=arr.length-1)
		{
			if(i==index)
			{
				arr[i] = element;
			}
		}
		else
		{
			System.out.println("index OutOfBound");
			break;
		}
	}
	for(int x : arr)
	{
		System.out.println(x);
	}
}
}
