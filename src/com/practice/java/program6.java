package com.practice.java;
import java.util.*;
public class program6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int [] arr = new int [scan.nextInt()]; 
		System.out.println("Enter the element of array");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Original array is : " );
		for(int x: arr)
		{
			System.out.print(x + " ");	
		}
		System.out.println();
		System.out.println("Enter the element which to be removed from array");
		int remove = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]==remove)
			{
				arr[i] = 0;
			}
		}
		System.out.println("Modified array is : ");
		for(int x:arr)
		{
			System.out.print(x + " " );
		}

	}
}
