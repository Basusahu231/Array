package com.Pratice.java;
import java.util.Arrays;
public class binarySearch {
public static int[] sort(int [] arr)
{
	Arrays.sort(arr);
	return arr;
}
public static int [] binarySearch(int [] array,int key )
{
	int low =0; 
	int high =array.length-1;
	while (low<=high)
	{
		int mid = (low+high)/2;
		if(mid==key)
		{
			System.out.println("Key found");
		}
		else if(key>mid)
		{
		low = mid+1;
		}
		else {
			high = mid-1; 
		}
	}
	return array;
}
}
