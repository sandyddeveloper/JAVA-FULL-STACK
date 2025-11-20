import java.util.Scanner;
class PrimeNumberSum 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the N number : ");
		int n = sc.nextInt();
		
		int count = 0;
		int sum = 0;
		int num = 2;
		boolean isPrime;
		
		while(num < n){
			isPrime = true;
			for (int i = 2; i <= num /2 ; i++ )
			{
				if (num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
			{
				System.out.println(num + " ");
				count++;
				sum += num;
			}
			
			num ++;
		}
		System.out.println("\nTotal prime numbers: " + count);
        System.out.println("Sum of all prime numbers: " + sum);
	}
}
