package com.Pratice.java;
import java.util.*;
import java.util.Arrays;
public class program4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String [] arr = new String [5];
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.next();
	}
	Arrays.sort(arr);
	for(int i=0; i<=arr.length-1; i++)
	{
		System.out.println(arr[i]);
	}
}
}
