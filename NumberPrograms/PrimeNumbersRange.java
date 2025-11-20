import java.util.Scanner;
class PrimeNumbersRange		
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the N NUMber : ");
		int n = sc.nextInt();
		
		int count = 0;
		int num = 2;
		boolean prime = true;
		
		while(num < n){
			prime = true;
			
			for (int i = 2; i <= num /2 ; i++ )
			{
				if (num % i == 0)
				{
					prime = false;
					break;
				}
			}
			
			if (prime)
			{
				count ++;
				System.out.print(num + " ");
			}
			
			num ++;
		}
		System.out.println(count + " is count");
	}
}


