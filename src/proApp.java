
public class proApp {
	public static int [] binarySearch(int [] arr, int key)
	{
		int low = 0; 
		int high =arr.length-1; 
		while(low <=high)
		{
			int mid = (low+high)/2;
			if(key == arr[mid])
			{
				System.out.println("Key is found");
				break;
			}
			else if(key >=arr[mid])
			{
				low = mid+1;

			}
			else
			{
				high =mid-1;
			}
		}
		return arr;
	}
}
