/* Compare two arrays are same or not */

class  CompareTheTwoArrays
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1,3,4,2,12};
		int[] arr2 = {1,2,3,4};
		
		if (arr1.length != arr2.length)
		{
			System.out.println("Not Same");
			
		}else{
			for (int i = 0; i<arr1.length -1; i++ )
		{
				for (int j = 0; j<arr2.length - 1 ; j++ )
				{
					if (arr1[j] < arr1[j+1])
					{
						int temp = arr1[j];
						arr1[j] = arr1[j+1];
						arr1[j+1] = temp;
					}
				}
				
				for (int k = 0; k<arr2.length - 1; k++ )
				{
					for (int l = 0; l<arr2.length - 1; l++ )
					{
						if (arr2[l] < arr2[l+1])
						{
							int temp = arr2[l];
							arr2[l] = arr2[l+1];
							arr2[l+1] = temp;
						}
					}
				}
		}
		}
		
		for (int i = 0; i<arr1.length ; i++ )
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i<arr2.length ; i++ )
		{
			System.out.print(arr2[i] + " ");
		}
		
		
		System.out.println();
		
		for (int i = 0; i<arr1.length ; i++ )
		{
			if (arr1[i]  != arr2[i])
			{
				System.out.print("Not Same");
				return;
			}
		}
		
		System.out.println("Same Same");
	}
}
