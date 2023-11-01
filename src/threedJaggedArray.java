import java.util.Scanner;
public class threedJaggedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no. of school");
		int [][][] arr = new int [scan.nextInt()][][];
		for(int i =0; i<=arr.length-1; i++)
		{
			System.out.println("Enter the no. of classes " + "present in school " + (i+1));
			arr[i] = new int [scan.nextInt()][];
		}
		for(int i=0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				System.out.println("Enter the no. of student "  +  " present in class " + (j+1) + " of school " + (i+1));
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k =0; k<=arr[i][j].length-1; k++)
				{
					System.out.println("Enter the age of student " + (k+1) + " of class" + ( j+1) + " of school " + (i+1));
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for(int i =0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[i].length-1; j++)
			{
				for(int k =0; k<=arr[i][j].length-1; k++)
				{
					System.out.println( " The age  of student "+  (k+1) + " of class " + (j+1) + "of school " + (i+1) + "is : " +  arr[i][j][k]);
				}
			}
		}
	}
}