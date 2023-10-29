package com.twodArray.java;
import java.util.*;
public class array4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the length of array");
	int [] arr = new int[scan.nextInt()];

	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	for(int x:arr)
	{
		System.out.println(x);
	}
	int y = arr.length;
	System.out.println(y);
	System.out.println("enter the length of array");
	int [] arr1 = new int [scan.nextInt()];
	int a1= arr1.length;
	for(int i = 0 ; i<=arr1.length-1; i++)
	{
		arr1[i] =  scan.nextInt();
	}

	for(int x:arr1)
	{
		System.out.println(x);
	}
	int z = arr1.length;
	System.out.println(z);
	
}
}
