package com.twodArray.java;

import java.util.*;

public class commonElement {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int [] arr =  new int [scan.nextInt()];
	int [] arr1 = new int [scan.nextInt()];
	for(int i=0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i =0; i<=arr1.length-1; i++)
	{
		arr1[i]= scan.nextInt();
	}
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]==arr1[i])

			{
			arr[i]=arr1[i];
			}
		for(int x:arr1)
		{
			System.out.println(x);

		}
	}
}
}
