package com.Selection.java;

public class program2 {
public static void main(String[] args) {
	int [] arr = {21,43,13,53,35};
	
	
	for(int i =0; i<=arr.length-2; i++)
	{
		int pos=i;
				
		int min = arr[pos];
		
		for(int j =i+1; j<=arr.length-1; j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				pos = j;
			}
			int temp = arr[pos];
			arr[pos] =arr[i];
			arr[i]=temp;
		}
	}
	for(int x : arr)
	{
		System.out.println(x);
	}
}
}
