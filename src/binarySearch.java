import java.util.*;
public class binarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// creation of array 
		int [] arr = new int [7];
		// Entering the element of array 
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1 ;  i++)
		{
			arr[i] = scan.nextInt();
		}
		int low =0; 
		int high =arr.length-1; 
		// Enter the key element which to be searched 
		System.out.println("Enter the key element which to be searched");
		int key =scan.nextInt();
		// 	This loop will run until the low value will become greater than high
		while (low <=high)
		{
			int mid  = (low +high)/2;
			if(key ==arr[mid])
			{
				System.out.println("Key is found");
				return ;  
			}
			else if(key > arr[mid])
			{
				low = mid +1;
			}
			else if (key < arr[mid])
			{
				high = mid -1; 
			}
			
		}
		System.out.println("Key is not present ");

	}
}
