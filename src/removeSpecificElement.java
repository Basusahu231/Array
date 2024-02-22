import java.util.*;
public class removeSpecificElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("Enter the element which you want to remove");
		int element = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if (arr[i] ==element)
			{
				arr[i] = 0;
			}
		}
		System.out.println("modified array is ");
		for(int x: arr)
		{
			System.out.print(x + " ");
		}
	}
}
