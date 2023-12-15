import java.util.*;
public class program10 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
int [] arr = new int[100];
System.out.println("Enter the element of array");
for(int i =0; i<=arr.length-1; i++)
{
	arr[i]=scan.nextInt();
}
for(int i =0; i<=arr.length-1; i++)
{
	if(arr[i]!=i+1)
	{
		System.out.println("Missing number is " + i);
	}
}
}
}
