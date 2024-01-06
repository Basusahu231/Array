
public class program16 {
	public static void main(String[] args) {
		String s = "please wait,continue to fight,continue to win";
		String[] arr =s.split(" ");
		int count = 0;
		for(int i =0; i<=arr.length-1; i++)
		{
			if(arr[i]==",")
			{
				i++;
			}
			count++;
		}
		System.out.println(count );
}
}