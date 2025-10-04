/* WAJP THE FOLLOWING PATTERN BY USING NEXTED FOR LOOP STATAMENT

O/P: ***
	 ***
	 ***

*/

class PatternProgram8 
{
	public static void main(String[] args) 
	{
		int n = 3; // this is the size for the matrix 3*3 rows&cols
		for (int i = 0; i < n ; i ++ ) // outer Loop for cols
		{
			for (int j = 0; j < n ; j ++ ) // inner Loop for rows
			{
				if (true)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(); // this is for seperate the * like row wise.. without this the o/p will be like **********
		}
	}
}
