import java.util.*;
public class twoJackArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of class");
		
		float [][] arr = new float[scan.nextInt()][];
	for(int i = 0; i<=arr.length-1; i++)
	{
		System.out.println("Enter the no. of students present in class  - " + (i+1));
		arr[i] =new float[scan.nextInt()];
	}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the percentage for class " + (i+1) + "student" + (j+1) );
				arr[i][j] = scan.nextFloat();
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j =0; j<=arr[i].length-1; j++)
			{
				System.out.println("The percentage for class " + " " + (i+1) +  " " + "student" +  " " + (j+1) + " " + "is :"  + arr[i][j] ); 
			}
		}
	}
}