import java.util.*;
public class jackedArray2 {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the no. of class");
	boolean [][] arr = new boolean [scan.nextInt()][];
for(int i =0; i<=arr.length-1; i++)
{
	System.out.println("Enter the no. of student " +"in class " + (i+1));
	arr[i] = new boolean[scan.nextInt()]; 
}
for(int i =0; i<=arr.length-1; i++)
{
	for(int j=0; j<=arr[i].length-1; j++)
	{
		System.out.println("Whether student   "  +(j+1)+" of class  " + (i+1)+ "  has complete project ?? "  );
		arr[i][j]=scan.nextBoolean();
	}
}
for(int i =0; i<=arr.length-1; i++)
{
	for(int j=0; j<=arr[i].length-1; j++)
	{
		if(arr[i][j]==true)
		{
	
			System.out.print("yes" + " ");
		}
		else
		{
			System.out.print("No"+ " ");
		}

	}
	System.out.println();
}
}
}