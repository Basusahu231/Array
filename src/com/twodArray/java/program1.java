package com.twodArray.java;
import java.util.*;
public class program1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number of fruits");
   int a = scan.nextInt();
 	String [] arr = new String [a];
 	for(int i = 0; i<=arr.length-1; i++)
 	{
 		System.out.println("enter the fruit name  ");
 		arr[i] = scan.next();
 	}
 	for(int i =0; i<=arr.length-1; i++)
 	{
 		System.out.println("the fruit name " + "is :" + arr[i]);
 	}
}
}
