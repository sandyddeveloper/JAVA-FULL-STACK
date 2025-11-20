import java.util.Scanner;
class PrimeWithSumAndProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		int prod = 1;
		int sum = 0;
		int num = 2;
		boolean isPrime;
		
		while (num < n)
		{
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
				count ++;
				sum += num;
				prod *= num;
				System.out.println("Prime Number are : " + num);
			}
			
			num ++;
		}
		System.out.println("sum : " + sum + " "+ "count :" + count + " " + "prod" + prod);
		
	}
}
