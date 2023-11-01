import java.util.*;
public class threedArray1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int [][][] arr = new int[2][3][5];
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++ )
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("enter the age of student "+ (k+1) + " of class " + (j+1) + " of school " + (i+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++ )
			{
				for(int k=0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("the age of student " + (k+1) + " of class " + (k+1) + " of school " + (i+1) + " is :" + arr[i][j][k]);
				}
			}
		} 
	}
}