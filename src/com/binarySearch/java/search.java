package com.binarySearch.java;
import java.util.*;
public class search {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the length of array");
int [] arr = new int [scan.nextInt()];
for(int i =0; i<=arr.length-1; i++)
{
	arr[i] = scan.nextInt();
}
int key = scan.nextInt();
int low =0; int high = arr.length-1; int mid = (low+high)/2;
for(int i =0; i<=arr.length-1; i++)
{
	if(key==arr[mid]);
	{
		System.out.println("key found");
		return;
	}
}
}
}
