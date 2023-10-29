import  java.util.*;
public class averTemparr {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr = new int[7];
	System.out.println("Enter the temperature of a week");
	for(int i =0; i<=arr.length-1; i++)
	{
		arr[i]=scan.nextInt();
	}
	int sum =0;
	for(int i =0; i<=arr.length-1; i++)
	{
		sum +=arr[i];
	}
	System.out.println("The average temperature of a week is : " + (sum/7) );
	
}
}
