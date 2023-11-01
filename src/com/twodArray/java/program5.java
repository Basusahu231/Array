package com.twodArray.java;
import java.util.*;
public class program5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of employee");
	int a = scan.nextInt();
	System.out.println("enter the  no. of companies ");
	int b = scan.nextInt();
	
	
	String [] [] arr =  new String[b][a];
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1 ; j++)
		{
			System.out.println("enter the company name" + (i+1) + "employee" + (j+1));
		}
		
	}
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j =0; j<=arr[i].length-1; j++)
		{
			System.out.println("the company name " + (i+1) + "is:" + "employee " + (j+1)  + "is : "  + arr[i][j]);
		}
	}
}
}
