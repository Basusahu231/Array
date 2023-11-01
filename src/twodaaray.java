import java.util.*;
public class twodaaray {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the no. of companies and employee");
	int a = scan.nextInt();
	int b = scan.nextInt();
	String [] []  arr = new String [a][b];
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			System.out.println("Enter the name for company " + (i+1) + " " + "employee" +  (j+1));
			arr[i][j] = scan.next ();
		}
	}
	for(int i =0; i<=arr.length-1; i++)
	{
		for(int j=0; j<=arr[i].length-1; j++)
		{
			System.out.println("The name for company " + (i+1) + " " +  "employee" + " " + (j+1) + "is : " + arr[i][j]);
		}
}
}
}