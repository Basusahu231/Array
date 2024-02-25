import java.util.*;
public class insertSpecifiedIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter the element");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Original array");
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		int length = arr.length-1;
		System.out.println();
		System.out.println("Enter the index at which you want to insert element");
		int index = scan.nextInt();
		System.out.println("Enter the element which you want to insert ");
		int element  = scan.nextInt();
		for(int i =0; i<=arr.length-1; i++)
		{
			if(length<=index)
			{
				i = index;
				arr[i] = element;	
			}
			else
			{
				System.out.println("Enter the index inside array length");
			}
		}
		System.out.println();
		System.out.println("Modified array");
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
		scan.close();
	}
}
