/* WAJP THE FOLLOWING PATTERN BY USING FOR LOOP STATAMENT

O/P:



*/


/* class PatternProgram41

{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i =0; i <= n ; i++ )
		{
			for (int j = 0 ; j <= n ; j++ )
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
} 

*/
     ///// second way to do this //////

class PatternProgram41

{
	public static void main(String[] args) 
	{
		int n = 5;
		int a = 1;
		for (int i =0; i < n ; i++ )
		{
			for (int j = 0 ; j < n ; j++ )
			{
				System.out.print(a + " ");
			}
			a++;
			System.out.println();
		}
	}
}
