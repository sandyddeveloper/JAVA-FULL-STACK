import java.util.Scanner;
class PalindromeString  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String word = "Madam";
		
		String rev = new StringBuilder(word).reverse().toString();
		
		if (word.equals(rev))
		{
			System.out.println("PalindromeString");
		}else
			System.out.println("Not PalindromeString")	;
		
		String res = "";
		
		for (int i = word.length()-1; i>=0; i-- )
		{
			res = res + word.charAt(i);
		}
		
		if (word.equals(res))
		{
			System.out.println("PalindromeString");
		}else
			System.out.println("Not PalindromeString")	;
	}
}
