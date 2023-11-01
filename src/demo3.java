import java.util.*;
public class demo3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of player");
		int Player = scan.nextInt();
		float [] arr  =  new float [Player];
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the height of player " + (i+1));
			arr[i] =scan.nextFloat();
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println("The height of player" + (i+1) + " " + "is : " + arr[i]);
		}
	}
}
