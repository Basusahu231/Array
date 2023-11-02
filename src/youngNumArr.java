import java.util.*;
public class youngNumArr {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
// Entering the length of array
	int [] arr = new int [scan.nextInt()];
	// Entering the element of array
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	} 
	// Considering the first element as smallest element 
	int smallest = arr[0]  ;
	// Now comparing with all the element 
	for(int i =0; i<=arr.length-1; i++)
	{
		if(arr[i]>smallest)
		{
			smallest = arr[i];
		}
	}
// The smallest elemenet is 
	System.out.println(smallest);
}
}
