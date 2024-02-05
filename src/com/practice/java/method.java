package com.practice.java;

public class method {
public static void main(String[] args) {
	String name;
	name();
	name("basu");
	name(10);
	name("java",1991);
}
public static void name ()
{
	System.out.println("Hello i am from Banglore");
}
public static void name(String name)
{
	System.out.println(name + " is eating food");
}
public static   void name (int x)
{
	x++;
	System.out.println(x);
}
public static void name(String name , int age)
{
	System.out.println(name + age);
}
}
