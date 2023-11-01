package com.twodArray.java;
import java.util.*;
public class program6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// creating 
	int [][][] arr = new int[2][3][5]; // [block][rows][columns]
	// storing the value in array
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j =0; j<=arr[i].length-1; j++)
		{
			for(int k =0; k<=arr[i][j].length-1; k++)
			{
				System.out.println(" enter the age of college" + (i+1) + "of class" + (j+1) + "of student" + (k+1) );
				arr[i][j][k] = scan.nextInt();
			}
		}
	}
		// retriving 
		for(int i = 0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++)
			{
				for (int k = 0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("the age of college" + (i+1) + "of class" + (j+1) + "of student" + (k+1) + "is: " + arr[i][j][k]);
			}
		}
			
		
	}
 }
}
