package com.twodArray.java;
import java.util.*;
public class linearSearch {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
	float [] arr = new float [scan.nextInt()];
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextFloat();
	}
	float key=scan.nextFloat();
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]==key)
		{
			System.out.println("key found");
			return;
		}
		
	}
	System.out.println("key not found");
}
}
