package com.Pratice.java;
import java.util.Scanner;
public class program1 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no. of student");
int [] arr = new int [scan.nextInt()];
for(int i =0; i<=arr.length-1; i++)
{
	System.out.println("Enter the marks of " + (i+1) + " " +   "student : ");
	{
		arr[i]= scan.nextInt();
	}
}
	for(int i =0; i<=arr.length-1; i++)
	{
		System.out.println("Marks of " + i + " " + "student is : " + arr[i] );
	
}

 
 }
}
