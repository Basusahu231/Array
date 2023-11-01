package com.binarySearch.java;

import java.util.Scanner;
import java.util.Arrays;
public class program2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the length of array");
		int [] arr= new int [scan.nextInt()];
		System.out.println("enter the number which to be stored");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		for(int x : arr)
		{
			System.out.println(x);
		}
		
		System.out.println("enter the key which to be stored");
	  int key = scan.nextInt();
	 int low =0;  int high =arr.length-1; 
	 while(low<=high)
	 {
		 int mid = (low + high)/2;
		 if(key==arr[mid])
		 {
			 System.out.println("key found at index : " + mid);
			 return;
		 }
		 else if(key>arr[mid])
		 {
			 low=mid+1;
		 }
		 else
		 {
			 high = mid-1;
		 }
	 }
	 System.out.println("key not found");
		
	}
}
