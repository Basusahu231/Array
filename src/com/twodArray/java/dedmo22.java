package com.twodArray.java;
import java.util.*;
public class dedmo22 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [scan.nextInt()];
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	int key =44;
	int low = 0; int high =arr.length-1;
	
    while (low<high)
    {
    	int mid = (low+ high)/2;
    	if(key == arr[mid])
    	{
    		
    		System.out.println("key found ");
    		return;
    	}
    }
    System.out.println("key not found");
}
}
