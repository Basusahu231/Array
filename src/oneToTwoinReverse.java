import java.util.*;
public class oneToTwoinReverse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] arr1= {1,2,3,4,5};
	int [] arr2 = new int [arr1.length];
	int j  = arr2.length-1;
	for(int i =0; i<=arr1.length-1; i++)
	{
		arr2[j] = arr1[i];
		j--;
	}
	System.out.println("reverse array is : ");
	for(int x : arr2)
	{
		System.out.println(x);
	}
	
}
}
