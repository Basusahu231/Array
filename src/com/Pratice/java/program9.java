package com.Pratice.java;
import java.util.*;
public class program9 {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
  String [] [] [] arr = new String[2][2][2];
  for(int i =0; i<=arr.length-1; i++)
  {
	  for(int j =0; j<=arr[i].length-1; j++)
	  {
		  for(int k =0; k<=arr[i][j].length-1; k++)
		  {
			  arr[i] [j] [k] = scan.next();
			 
		  }
	  }
  }
  for(int i =0; i<=arr.length-1; i++)
  {
	  for(int j =0; j<=arr[i].length-1; j++)
	  {
		  for(int k =0; k<=arr[i][j].length-1; k++)
		  {
			  System.out.println(arr[i][j][k]);
		  }
	  }
  }
}
}
