package com.practice.java;
import java.util.*;
public class program2 {
public static void main(String[] args) {
	Scanner scan =  new Scanner(System.in);
 int [] arr = new int [4];
 System.out.println("Enter the element of array");
 for(int i =0; i<=arr.length-1; i++)
 {
	 arr[i] = scan.nextInt();
 }
 for(int x : arr)
 {
	 System.out.println(x);
 }
 for(int i =arr.length-1; i>=0; i--)
 {
	 System.out.println(arr[i]);
 }
}
}
