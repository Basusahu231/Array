
public class insertionsort {
public static void main(String[] args) {
	int [] arr = {82, 76, 54, 29, 33};
	// this loop will trace the ith element 
	for(int i =1; i<=arr.length-1; i++)
	{
		// we are storing arr[i] = in item variable;
		int item = arr[i];
	// jth elemement start from i-1;
		int j =i-1; 
		// this loop will go till j value is greater than and equal to zero and arr[j] > than item
		while(j>=0 && arr[j]>item)
		{
			// storing arr[j] value in arr[j+1]
 			arr[j+1] = arr[j];
			j--;
		}
		// storing item value in arr[j+1]
		arr[j+1] = item;
	} 
	for (int x : arr)
	{
		System.out.println(x);
	}
}
}
