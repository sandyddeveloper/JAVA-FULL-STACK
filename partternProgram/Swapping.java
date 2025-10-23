import java.util.Scanner;
class Swapping 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter " + n + "elements: ");
		for (int i = 0; i<n ; i++ )
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array before");
			for (int i =0; i<n ; i++ )
			{
			System.out.println(a[i] + " ");
			}
			
		int temp = a[0];
		a[0] = a[n - 1];
		a[n - 1] = temp;
		
		System.out.println(" After array swapped ");
		for (int i = 0; i<n ;i++ )
		{
			System.out.println(a[i] + " ");
		}
		
		
		
		
	}
}
