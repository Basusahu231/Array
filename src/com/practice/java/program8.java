package com.practice.java;
import java.util.*;
public class program8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr  = new int [scan.nextInt()];
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		int Positive = 0;
		int Negative = 0;
		int Even = 0; 
		int Odd = 0;
		int Zero = 0;
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]>0)
			{
				Positive++;
			}
			else if(arr[i]<0)
			{
				Negative++;
			}
			else
			{
				Zero++;
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				Even++;
			}
			else if(arr[i]%2!=0)
			{
				Odd++;
			}

		}
		System.out.println( "Total  Positive numbers are " + Positive);
		System.out.println("Total  Negative numbers are " + Negative);
		System.out.println("Total  Even numbers are " + Even);
		System.out.println( "Total  Odd numbers are " + Odd);
		System.out.println( "Total  Zeroes are " + Zero);

		scan.close();
	}
}
