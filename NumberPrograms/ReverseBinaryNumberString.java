import java.util.Scanner;
class ReverseBinaryNumberString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		String binary = sc.nextLine();
		
		if (!binary.matches("[01]+"))
		{
			System.out.println("this is not binary number >>>>>");
			return;
		}
		String rev = new StringBuilder(binary).reverse().toString();
		
		System.out.print(rev);
	}
}
