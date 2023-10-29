package com.twodArray.java;
import java.util.Scanner;
public class array2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	 int multiply = 1;
	 int [] arr = new int[scan.nextInt()];
	 for(int i =0; i<=arr.length-1; i++)
	 {
		 arr[i] = scan.nextInt();
		 multiply*=arr[i];

	 }
	 System.out.println(multiply);
	}
	}

}
