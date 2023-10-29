import java.util.*;
public class arr1Adarr2Eqlarr3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		// taking length of first array
		System.out.println("Enter the length of  first array");
		int [] arr1 = new int [scan.nextInt()];
		// taking length of second array
		System.out.println("Enter the length of second array");
		int [] arr2 = new int [scan.nextInt()];
		// adding the length of first and second array 
		int [] arr3 = new int [ (arr1.length + arr2.length)];
		// Entering the element of first array 
		for(int i =0; i<=arr1.length-1; i++)
		{
			System.out.println("Enter the element of first array");
			arr1[i]=scan.nextInt();
		}
		// Entering the element of second array
		for(int i =0; i<=arr2.length-1; i++)
		{
			System.out.println("Enter the element of second array");
			arr2[i]=scan.nextInt();
		}
		// Copying the element of first array into third array 
		for(int i =0; i<=arr1.length-1; i++)
		{
			arr3[i] = arr1[i];
		}
		// taking j variable 
		int j =0;
		// Copying the element of second array into third array 
		for(int i=arr1.length; i<=arr3.length-1; i++)
		{
			arr3[i] = arr2[j];
			j++;
		}
		// Printing the element of first array using enhanced loop
		System.out.println("Element of first array is :");
		for(int x : arr1)
		{
			System.out.print(x+ " ");
		}
		System.out.println();
		// Printing the element of second array
		System.out.println("Element of second array is :");
		for(int y : arr2)
		{
			System.out.print(y + " ");
		}
		System.out.println();
		// Printing the element of third  array after merging first and second array 
		System.out.println("After merging the element are : ");
		for (int z : arr3)
		{
			System.out.print(z + " ");

		}
		System.out.println();
	}
}
