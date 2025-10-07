/* WAJP THE FOLLOWING PATTERN BY USING FOR LOOP STATAMENT

		O/P:    * * * * * 
					    *
				        *
				        *
		                * 

*/

class PatternProgram25
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 0; i<n ; i++ )
		{
			for (int j = 0; j<n ; j++ )
			{
				if (j==n-1 || i==0)
				{
					System.out.print("* ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
