package com.practice.java;

public class program15 {
	public static void main(String[] args) {
		int a = 10 , b =5, temp =1;
		for(int i =1; i<=a && i<= b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				temp =i;
			}
		}
		System.out.println(temp);
	}
}
