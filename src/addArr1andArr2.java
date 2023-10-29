import java.util.*;
public class addArr1andArr2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// Entering the length of first array
	System.out.println("Enter the length of first array");
	int [] arr1 = new int[scan.nextInt()];
	int []  arr2 = new int [arr1.length];
	int [] arr3 = new int [arr1.length];
	// Entering the element of first array
	System.out.println("Enter the element of first array");
	for(int i =0; i<=arr1.length-1; i++)
	{
		arr1[i]=scan.nextInt();
	}
	// Entering the element of second array
	System.out.println("Enter the element of second array");
	for(int i =0; i<=arr2.length-1; i++)
	{
		arr2[i] = scan.nextInt();
	}
	// Storing the element in arr3 after adding arr1 & arr2 elements
	for(int i=0; i<=arr1.length-1; i++)
	{
		arr3[i] = arr1[i]+arr2[i];
	}
	// displaying the element of arr3
	System.out.println("Element after adding are  :");
	for(int x : arr3)
	{
		System.out.print(x + " ");
	}
	System.out.println();
}
}
