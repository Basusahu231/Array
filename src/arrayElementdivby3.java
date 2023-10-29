import java.util.*;
public class arrayElementdivby3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// Entering the length of array
	System.out.println("Enter the length of array");
	int [] arr = new int [scan.nextInt()];
	// Entering the element of array
	System.out.println("Enter the element :");
	for(int i=0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	// Printing the original array  
	System.out.println("Original array is :");
	for(int x : arr)
	{
		System.out.print(x+" ");
	}
	System.out.println();
	// printing the element if it is divisble by 3 then it will print -1 other wise it will print element value
	System.out.println("Modified array is : ");
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]%3==0)
		{
		System.out.print("-1" + " ");
		}
		else
		{
			System.out.print(arr[i] +" ");
		}
	}
}
}
