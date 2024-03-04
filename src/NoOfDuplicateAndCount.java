import java.util.Arrays;
public class NoOfDuplicateAndCount {
	public static void main(String[] args) {
		int[] arr = {1,3,1,2,4,3,5,1,6};
		Arrays.sort(arr);
		int count =1;
		int i =0;
		arr[i] =0;
		for( i =0; i<=arr.length-1; i++)
		{
			for(int j =1; i<=arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else
				{
					break;
				}
				
			}
	}
		if(count>1)
		{
			System.out.println(arr[i] + " " + count);
			i+=count-1;
		}

	}

}




