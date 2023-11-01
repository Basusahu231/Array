
import java.util.*;
public class Matrixadd {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] [] arr1 = new int [2][2];
	int [] [] arr2 = new int [2][2];
	int [][] arr3 = new int[2][2];
	for(int i =0; i<=arr1.length-1; i++)
	{
		for(int j=0; j<=arr1[i].length-1; j++)
		{
			arr1[i][j] = scan.nextInt();
		}
	}
	for(int i =0; i<=arr2.length-1; i++)
	{
		for(int j=0; j<=arr2[i].length-1; j++)
		{
			arr2[i][j] = scan.nextInt();
		}
	}
	for(int i =0; i<=arr3.length-1; i++)
	{
		for(int j=0; j<=arr3[i].length-1; j++)
		{
	arr3[i][j] = arr1[i][j] + arr2[i][j];		
		}
	}
	for(int i =0; i<=arr3.length-1; i++)
	{
		for(int j=0; j<=arr3.length-1; j++)
		{
			System.out.print(arr3[i][j]+ " ");
		}
		System.out.println();
	}
}
}
