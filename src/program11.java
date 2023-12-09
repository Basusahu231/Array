import java.util.*;
public class program11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array ");
		int [] arr = new int [5];
		System.out.println("Enter the element");
		for(int i =0; i<=arr.length-1; i++)
		{ 
			arr[i]  = scan.nextInt();
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println("Missing number is" + (i+1));
				return;
			}


		}
	}
}
