package com.practice.java;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr  = new int [5];
		System.err.println("enter the element of array ");//10 20 30 40 50
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		int count = 0;
		System.out.println("Enter the element which to be searched"); //30
		int key  = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]==key)
			{
				count++;
				continue;
			}
		}
		if(count==1)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
		scan.close();
	}
}
