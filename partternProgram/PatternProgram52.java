/* WAJP THE FOLLOWING PATTERN

O/P:  SEMITRIANGLE

* * * * *
  * * * *
    * * *
  * * * *
* * * * *


*/

class PatternProgram52
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 0; i<n ; i++ ) // row 
		{
			for (int j = 0; j<n ; j++ ) // col
			{
				if (i<=j || i+j>=n-1 )
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
