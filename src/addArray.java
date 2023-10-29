import java.util.*;
public class addArray {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	for(int i =0; i<=arr.length-1; i++)
	{
		System.out.println("Enter the element of array");
		arr[i] = scan.nextInt();
	}
	int res = 0;
	for(int i =0; i<=arr.length-1; i++)
	{
		  res = res +  arr[i]; 
	}
	System.out.println(res);
}
}
