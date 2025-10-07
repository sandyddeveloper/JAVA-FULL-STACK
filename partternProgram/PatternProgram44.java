/* WAJP THE FOLLOWING PATTERN

O/P:  

*/

class PatternProgram44
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 0; i<n ; i++ ) // row 
		{
			for (int j = 0; j<n ; j++ ) // col
			{
				if (j==3 && i==3 )
				{
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
