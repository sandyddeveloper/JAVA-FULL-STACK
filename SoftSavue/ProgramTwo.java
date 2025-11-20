/* Write a program to find sum of digits of a given number. */
import java.util.Scanner;
class  ProgramTwo
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0){
			sum += num % 10;
			num /= 10;
		}
		
		System.out.println("The Sum of the number is " + sum);
	}
}
