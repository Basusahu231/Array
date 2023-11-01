package com.Pratice.java;
import java.util.*;
public class program3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the  length of array  : ");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of the array ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Enter the key which to be searched");
	int key =scan.nextInt();
	int low = arr[0];
	int high = arr[arr.length-1];
	while(low<=high)
	{
		int mid = (low+high)/2;
		if(key==mid)
		{
			System.out.println("key is found ");
			return;
		}
		else if(key>mid)
		{
			low = mid+1;
		}
		else if(key<mid)
		{
		high = mid-1;
		}
	}
	
		{
			System.out.println("key  is not    present in array");
		}
	
}
}
