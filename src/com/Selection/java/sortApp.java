package com.Selection.java;

public class sortApp {
public static int [] selection(int [] arr)
{
	for(int i=0; i<=arr.length-2; i++ )
	{
		 int pos= i ;
		int min = arr[pos];
		
	for(int j =i+1; j<=arr.length-1; j++)
	{
		if(arr[j]<min)
		{
			min = arr[j];
			pos =j;
		}
	}
 int temp = arr[pos];
 arr[pos]= arr[i];
 arr[i]= temp;
	
	}
	return arr;
	}
}
