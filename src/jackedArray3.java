import java.util.*;
public class jackedArray3 {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the no. of companies ");
		String [] [] arr = new String [scan.nextInt()][];
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the no. of employee present in companies " + (i+1));
			arr[i] = new String[scan.nextInt()];
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the name of employee "+ (j+1)+ " of company " + (i+1));
				arr[i][j]=scan.next();
			}

		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++)
			{
				System.out.println("The name of employee " + (j+1) + " of company " + (i+1) + " is : " + arr[i][j]);
			} 
		}
	}
}
