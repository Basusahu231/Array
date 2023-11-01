package com.twodArray.java;
import java.util.*;
public class program4 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int [][] arr = new int [3][3];
for(int i =0; i<=arr.length-1; i++)
{
	for(int j =0; j<=arr[i].length-1; j++)
	{
		arr[i][j] = scan.nextInt();
	}
}
	for(int i = 0; i<=arr.length-1; i++)
	{
		for(int j =0; j<=arr.length-1; j++)
		{
			System.out.print(arr  [i][j]);
	}
		System.out.println();
}

}
}
