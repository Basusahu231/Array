package com.twodArray.java;
import java.util.*;
public class ageStudent {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [scan.nextInt()];
	System.out.println("enter the age of the student  : ");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	int smallest = arr[0];
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]<smallest)
		{
			smallest = arr[i];
		}
	}
	System.out.println(smallest);
}
}
