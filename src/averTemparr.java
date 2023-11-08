import  java.util.*;
public class averTemparr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = scan.nextLine();
		int res = string(s) ;
	}
	public static  int string(String s)
	{
		int res = s.length();
		System.out.println(res);
		return res;
	}
}
