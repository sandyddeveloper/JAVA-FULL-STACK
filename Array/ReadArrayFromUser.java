/* Read array from user and print it */

class  ReadArrayFromUser
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		
		int num = sc.nextInt();
		
		int arr = new int[num];
		
		for (int i = 0; i<num ; i++ )
		{
			System.out.println("Enter the number : ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i<num ; i++ )
		{
			System.out.println(arr[i] + " ");
		}
		
		
	}
}
