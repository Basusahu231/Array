import java.util.*;
public class threeJagedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of branch");
		String [][][] arr = new String [scan.nextInt()][][];
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the  of team " + "present in branch "  + (i+1));
			arr[i] = new String [scan.nextInt()][];

		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the employee"  +"present in team " + (j+1) + "present in branch" + (i+1));
				arr[i][j] = new String[scan.nextInt()];
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the name of employee " + (i+1)  + " of team " + (j+1) + " of branch" + (i+1));
					arr[i][j][k] =scan.next();
				}
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("The name of employee" + (k+1) + "of team " +  (j+1) + " of branch " + (i+1) + arr[i][j][k] );
				}
			}
		}
	}
}