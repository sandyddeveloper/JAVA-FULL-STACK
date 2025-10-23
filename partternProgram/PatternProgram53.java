/* WAJP THE FOLLOWING PATTERN

O/P:  SEMITRIANGLE

* * * * *
  * * * *
    * * *
  * * * *
* * * * *


*/

class PatternProgram53
{
	public static void main(String[] args) throw Inter
	{
		int n = 5;
		for (int i = 0; i<n ; i++ ) // row 
		{
			for (int j = 0; j<n ; j++ ) // col
			{
				if (i>=j && i+j>=n-1 || i<=j && i+j<=n-1)
				{
					System.out.print("* ");
					Thread.sleep(1000);
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
