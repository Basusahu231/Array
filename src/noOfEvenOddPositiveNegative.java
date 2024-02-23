import java.util.*;
public class noOfEvenOddPositiveNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter the element of array");
		for(int i =0; i<=arr.length-1; i++)
		{
			arr[i] = scan.nextInt();
		}
		int pos =0;
		int neg = 0;
		int even = 0;
		int odd = 0;
		int zero = 0;
		for(int i = 0; i<=arr.length-1; i++ )
		{
			if(arr[i]>0)
			{
				pos++;
				if(arr[i]%2==0 )
				{
					even++;
				}
				else if(arr[i]%2!=0)
				{
					odd++;
				}
			} 
			else if(arr[i]<0)
			{
				neg++;
				if(arr[i]%2==0)
				{
					even++;
				}
				else if(arr[i]%2!=0)
				{
					odd++;
				}
			}
			else if(arr[i]==0)
			{
				zero++;
			}
		}
		System.out.println( " even " + even);
		System.out.println( " odd " + odd);
		System.out.println( " pos " + pos);
		System.out.println( " neg " + neg);
		System.out.println( "zero " + zero);


		scan.close();
	}
}
