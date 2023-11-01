package com.bubbleSort.java;
import java.util.*;
public class BubbleSortApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of array");
		int [] arr = new int [scan.nextInt()];
		System.out.println("enter the element of array");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]= scan.nextInt();
		}
		System.out.println("the array element before sorting");
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		int [] sortedarray=BubbleSort.bubblesort(arr);
		System.out.println("the array element after sorting");
		for(int x: sortedarray)
		{
			System.out.println(x);
		}
		int a = ~12;
	System.out.println(a); 
	}

}
