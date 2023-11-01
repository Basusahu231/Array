package com.bubbleSort.java;

public class sort {
public static void main(String[] args) {
	int [] arr = {55,32,3,45,34,};
	int n =5;
	int temp;
	for(int i=0; i<=n-2; i++)
	{
		for(int j=0; j<=(n-i-2); j++)
		{
			if(arr[j]>arr[j+1])
			{
			temp = arr[j+1];
			arr[j+1]= arr[j];
			arr[j]= temp;
			}
		}
	}
	for(int y : arr)
	{
		System.out.println(y);
	}
}
}
