import java.util.*;
public class adding {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// giving the length of array
	System.out.println("enter the length of array");
	int [] arr = new int[scan.nextInt()];
	int [] arr1 = new int[arr.length];
	int [] arr2 = new int [arr.length];
	// entering the element of first array
	System.out.println("enter the element of first array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	// entering the element of second array
	System.out.println("enter the element of second array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr1[i]=scan.nextInt();
	}
	// adding the element of first and second array and storing in third array
	for(int i =0; i<=arr.length-1; i++)
	{
		arr2[i]= arr[i] + arr1[i]; 
	}
	// printing the  sum of first and second array
	for(int i=0; i<=arr.length-1; i++)
	{
		
	
	System.out.println(arr2[i]);
}
}

}
