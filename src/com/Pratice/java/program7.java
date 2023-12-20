package com.Pratice.java;
import java.util.*;
public class program7 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int a  = scan.nextInt();
int [] arr = new int [a];
for(int i = 0; i<=arr.length-1; i++)
{
	arr[i] = scan.nextInt();
}
for(int x : arr)
{
	System.out.println(x);
}
}
}