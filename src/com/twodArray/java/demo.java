package com.twodArray.java;
import java.util.*;
public class demo {
	public static void main(String[] args) {
		
		
//		int x = 5*2;
//		for(int i  = 1; i<=5; i++)
//		{
//			for(int j = 1; j<=x; j++)
//			{
//				if(j<=x/2)
//					System.out.print("-");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			x = x-2;
		
		int x = 153;
		
		int count = 0;
		int n = x;
		while(n!=0)
		{
			 n = n/10;
			count++;
		}
		
		n = x;
		int sum= 0;
		while(n!=0)
		{
			int r = n%10;
			sum = sum+(int)Math.pow(r, count);
			n = n/10;
		}
		if(sum==x)
			System.out.println(x+" Amstrong Numaber");
		else
			System.out.println("Not Amstrong Numaber");
	}
}
