import java.util.*;
public class evenIndex {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// taking length of array from user input
	System.out.println("Enter the length of array");
	int [] arr = new int[scan.nextInt()];
	// taking element of array from user input
	for(int i =0; i<=arr.length-1; i++)
	{
		System.out.println("Enter the element of array");
		arr[i]=scan.nextInt();
	}
	// printing the element which is present at even index
	for(int i =0; i<=arr.length-1; i++)
	{
		if(i%2==0)
		{
			System.out.println("Element present at even index are  :  " + arr[i]);
		}
	}
}
}
