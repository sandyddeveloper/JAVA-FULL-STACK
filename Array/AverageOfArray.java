/* Find average of array elements */

class  AverageOfArray
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6};
		
		double avg = 0;
		double sum = 0;
		int num = arr.length; 
		for (int i = 0; i<arr.length ; i++ )
		{
			sum += arr[i];
		}
		
		avg = sum/num;
		
		System.out.println(avg);
	}
}
