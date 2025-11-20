import java.util.Scanner;
class PrimeNumbers
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		if(n <= 1){
			isPrime = false;
		}else{
			for(int i = 2; i < n/2 ; i ++) {
				if(n % i == 0){
					isPrime= false;
					break;
				}
				
			}
		}
		
		if(isPrime){
			System.out.println("IT PRIME");
		}else{
			System.out.println("NOT AT ALL");
		}
	}
}
