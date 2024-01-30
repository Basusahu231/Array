package com.practice.java;
import java.util.*;
public class program13 {
	//Write a Java program to find the duplicate values & occurrence of an integer array .
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int[scan.nextInt()];
		int [] arr1 = new int[arr.length];
		System.out.println("Enter the element of array");
		for(int i =0; i<=arr.length-1;i++)
		{
			arr[i]   = scan.nextInt();
		}
		int count = 0;
		for(int i =0; i<=arr.length-1; i++)
		{
			arr1[i] = arr[i];		
		}
		for(int y : arr)
		{
			System.out.println(y);
		}
		System.out.println("---------------------------");

		for(int x: arr1)
		{
			System.out.println(x);
		}
		System.out.println("---------------------------");
		for(int i =0; i<=arr.length-1; i++)//10,20,10,30,20
		{
			//5
			for(int j = 0; j<=arr1.length-1; j++)//10,20,10,30,20
			{
				if(i!=j)
				{
					if(i>j)	
					{
						if(arr[i]==arr1[j]) 
						{
							count++;//2
							System.out.println(arr1[j]);
						}
					}
				}
			}
		}
		System.out.println("---------------------------");
		System.out.println(count);
	}
}