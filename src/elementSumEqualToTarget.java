import java.util.*;
public class elementSumEqualToTarget {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int [scan.nextInt()];
	System.out.println("Enter the element of array");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i] = scan.nextInt();
	}
	sum(arr);
}
public static void  sum(int [] arr)
{
	int target = 5;
	for(int i =0; i<=arr.length-1; i++)//1,
	{
		for(int j =1; j<=arr.length; i++)//4,
		{
			if(arr[i] + arr[j] == target)//5
			{
				System.out.println("The element are"  + arr[i]  + "and" + arr[j]);
			}
		}
	}
}
}