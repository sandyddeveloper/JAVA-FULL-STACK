/* Find sum of array elements */

class SumOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		int count = 0;
		
		
		for (int i = 0 ; i<arr.length ; i++ )
		{
			sum += arr[i];
			count++;
		}
		
		System.out.println(sum);
		System.out.println(count);
	}
}
