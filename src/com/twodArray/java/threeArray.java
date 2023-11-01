package com.twodArray.java;
import java.util.*;
public class threeArray {
public static void main(String[] args) {
	Scanner scan = new Scanner  (System.in);
	System.out.println("enter the length of first array");
	int [] arr = new int [scan.nextInt()];
	int []arr1 = new int [arr.length];
	int [] arr2 = new int[arr1.length];
	System.out.println("enter the element first array");
	for(int i =0; i<=arr.length-1; i++)
	{
	
		arr[i]= scan.nextInt();
	}
	System.out.println("enter the element second  array ");
	for(int i =0; i<=arr.length-1; i++) {
		
		arr1[i]=scan.nextInt();
 	}
	
	for(int i =0; i<=arr.length-1; i++)
	{
	  arr2[i] = (arr[i] + arr1[i]);


} 
	for(int x : arr2)
	{
		System.out.println( "the addition of arr + arr1   is : "  + x);
	}
}
}