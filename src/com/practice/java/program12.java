package com.practice.java;

public class program12 {
	public static void main(String[] args) {
		int [] arr = {23,98,43,3,11};
		int max = arr[0];
		int min = arr[0];
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			else if(min>arr[i])
			{ 
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
