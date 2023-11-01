package com.Pratice.java;
import java.util.*;
public class twodArray {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the no. of class and student ");
int [][] arr = new int [scan.nextInt()][scan.nextInt()];
for(int i =0; i<=arr.length-1; i++)
{
	for(int j=0; j<=arr[i].length-1;j++)
	{
		System.out.println("Entet the marks of  class " + (i+1) + " " + "student" + (j+1) + ": ");
		arr[i][j] = scan.nextInt();
	}

	
}
for(int i =0; i<=arr.length-1; i++)
{
	for(int j=0; j<=arr[i].length-1; j++)
	{
		System.out.println("the marks of class" + (i+1) + " " + "of student "+ (j+1)+" " +   "is:" + arr[i][j]);
	}
	
}

}
}
