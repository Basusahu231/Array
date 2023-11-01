package com.Selection.java;
import java.util.*;
public class sort {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element in the array");
for(int i =0; i<=arr.length-1; i++)
{
	arr[i]= scan.nextInt();
}
System.out.println("Element before sorting ");
for(int x : arr)
{
	System.out.print(x);

}
System.out.println();
   int []res=sortApp.selection(arr);
//   System.out.println(res);
   System.out.println("element after sorting");
   for(int x : res)
   {
	   System.out.println(x);
   }
}
}
