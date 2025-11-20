/* Find the smallest element */

class FindTheSmallElement
{
	public static void main(String[] args) 
	{
		int[] arr = {135,99,95,96,3,9462,956};
		int small = arr[0];
		
		for (int i = 0; i< arr.length ; i++ )
		{
			if (arr[i] < small)
			{
				small = arr[i];
			}
		}
		
		System.out.print(small);
	}
}
