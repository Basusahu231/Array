
public class pairNumber {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	// first number (1,2,3,4,5)
	for(int i =0; i<=arr.length-1; i++)
	{
		int curr = arr[i];
		// (1,2),(1,3),(1,4),(1,5),(2,3),(2,4),(2,5),(3,4),(3,5),(4,5)
		for(int j = i+1; j<=arr.length-1; j++)
		{
			
			System.out.print(   "(" +  curr  +"," + arr[j] +  ")");
		}
		System.out.println();	
	}


}
}
