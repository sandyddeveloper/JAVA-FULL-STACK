/* Copy one array to another */

class CopyOneArrayToAnother
{
	public static void main(String[] args) 
	{
		int[] num = {1,9,8,6,8,4,8,5,7,5,8};
		
		int[] arr = new int[num.length];
		
		for (int i = 0; i<arr.length ; i++ )
		{
			arr[i] = num[i];
		}
			
		for (int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("*****************************************");
		
		for (int i = 0 ; i<arr.length ; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
}
