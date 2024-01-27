package com.practice.java;

import java.util.Scanner;

public class program11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int[scan.nextInt()];
		System.out.println("Enter the element of array ");
		for(int i =0; i<arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		for(int i =1; i<=arr.length-1; i++)//12,34,4,5,3
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]<min)
			{
				max = arr[i];
			}

		}
		System.out.println("max"  +max);
		System.out.println("min"  +min);
	}
}