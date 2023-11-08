import java.util.*;
public class program2 {
	//  SEARCHING ELEMENT IS PRESENT IN THE ARRAY OR NOT 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Entering the length of array 
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
	//  Entering the element of array
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] =scan.nextInt();
		}
		// Entering the element which want to search 
		System.out.println("Enter the element which you want to search");
		int search  = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]  == search)
			{
				System.out.println("Element is present ");
				return;
			}
		}
		System.out.println("Element is not present");
	}
}
