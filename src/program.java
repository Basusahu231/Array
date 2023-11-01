import java.util.*;
public class program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr  = new int [scan.nextInt()];
		System.out.println("Enter the element of array ");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i]  = scan.nextInt();
		}
		System.out.println("Enter the which to be searched");
		int key = scan.nextInt();
		int [] res  = programApp.bubbleSort(arr);
		int [] res1  = proApp.binarySearch(arr, key); 
	}
}
