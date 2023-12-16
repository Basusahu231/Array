package com.bubbleSort.java;
import java.util.*;
public class SortApp {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]= scan.nextInt();
	}
	System.out.println("enter the key which to be search");
	
	System.out.println("Element before sorting : ");
	for(int x: arr)
	{
		System.out.print(x + " ");
	}
	System.out.println();
	 
	int [] res =BubbleSort.bubblesort(arr);
	System.out.println("Element after sorting");
	for(int x : res)
	  {
		  System.out.print(x + " ");
	  }
	System.out.println();
	  int [] res1=BinarySearch.search(arr);
	  System.out.println(res1);
	  int key = scan.nextInt();
	  int low = 0; int high  = arr.length-1;
	  
	  while(low<=high)
	  {
	  	int mid = (low+high)/2;
	  	if(key==arr[mid])
	  	{
	  		System.out.println("key found");
	  	}
	  	else if(key>arr[mid])
	  	{
	  		low = mid+1;
	  	}
	  	else
	  	{
	  		high = mid -1;
	  	}
	  }
	  System.out.println("key not found ");
	  for(int y : arr)
	  {
		  System.out.println(y);
	  }
}
}