/* Find the largest element */

class FindTheLargestElement
{
	public static void main(String[] args) 
	{
		int[] arr = {25,74,14,152,1,95,100};
		int largest = arr[0];
		
		for (int i = 0 ;i<arr.length ; i++ )
		{
			if (arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		System.out.print(largest);		
	}
}
