import java.util.Scanner;
class Recursion 
{
	public static void main(String[] args) 
	{
		String str = "Hello this is me";
		System.out.println("Final Output: " + recurse(str));
	}
	public static String recurse(String str){
		if (str.isEmpty())
		{
			return str;
		}
			return recurse(str.substring(1)) + str.charAt(0);
	}
}
