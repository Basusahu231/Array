
public class copyOneToSecondArray {
public static void main(String[] args) {
	//  this is first array
	int [] arr1 = {20, 30, 40, 50 , 60};
	// this is second array which is empty
	int [] arr2 = new int [arr1.length];
	// using loop to copy element of first array to second array
	for(int i=0; i<=arr1.length-1; i++)
	{
		arr2[i]=arr1[i];
	}
	// printing the copied element in second array
	System.out.println("Copied element are :");
	for(int i =0; i<=arr2.length-1; i++)
	{
		System.out.println(arr2[i]);
	}
	}
}
