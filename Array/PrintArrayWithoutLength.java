/* Find the length of array without using .length */

class  PrintArrayWithoutLength
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3};
		
		int count = 0;
		
		try
		{
			while (true)
			{
				int x = arr[count];
				count++;
			}
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
		}
		
		System.out.println(count);
	}
}
