import java.util.*;
public class countEvenandOddInA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int[scan.nextInt()];
		System.out.println("Enter the element of array");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		int even = 0;
		int odd = 0;
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("The number of even element present in an array is " + even);
		System.out.println("The number of odd element present in an array is " + odd);
	} 
}
