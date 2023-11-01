package com.twodArray.java;
import java.util.*;
public class program2 {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
	System.out.println("enter the no. of player");
	int a = scan.nextInt();
	int [] arr = new int [a];
	// storing the value in array
	for(int i = 0; i<=arr.length-1; i++)
	{
		System.out.println("enter the height of player " + (i+1));
		arr[i] = scan.nextInt();
	}
	// Retriving  the  value
	for(int i = 0; i<=arr.length-1; i++)
	{
		System.out.println("the height of player " + (i+1) + "is :"+ arr[i]);
		
	}
	
}
}
