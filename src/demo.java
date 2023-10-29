import java.util.*;
public class demo {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Enter the number of fruits");
int a = scan.nextInt();
String [] arr = new String [a];
for(int i =0; i<=arr.length-1; i++)
{
	System.out.println("Enter the name of fruit " + (i+1));
	arr[i] = scan.next();
}
for(int i =0; i<=arr.length-1; i++)
{
	System.out.println("The name  of fruit " +  (i+1) + " " + "is : " + arr[i]);
}
}
}
