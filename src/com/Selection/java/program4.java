package com.Selection.java;
import java.util.*;
public class program4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = {82, 94, 54, 29, 33};

		for(int i =0; i<=arr.length-2; i++)
		{
			for(int j = i+1; j<=arr.length-1; j++)
			{
				int pos = i;
				int min=arr[pos];
				if(arr[j]<min)
				{
					min=arr[j];
					pos = j;
				} 
				int temp = arr[pos];
				arr[pos]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
