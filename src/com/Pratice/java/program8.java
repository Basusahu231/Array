package com.Pratice.java;

import java.util.Scanner;

public class program8 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[][] arr = new int[2][];
      arr[0] = new int[2];
      arr[1] = new int[3];
      for(int i =0; i<=arr.length-1; i++)
      {
    	  for(int j = 0; j<=arr[i].length-1; j++)
    	  {
    	      System.out.println("enter the age of student  of " + (j+1) + " of class "+ (1+i ) + arr[i][j]);
    		  arr[i][j] = scan.nextInt();
    	  }
      }
      for(int i =0; i<=arr.length-1; i++)
      {
    	  for(int j = 0; j<=arr[i].length-1; j++)
    	  {
  	System.out.println("the age of student " + (j+1) +  "of class " + (i+1) + " is " + arr[i][j]);	  
    	  }
      }
}
}
