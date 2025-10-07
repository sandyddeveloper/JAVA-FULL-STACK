/* WAJP THE FOLLOWING PATTERN BY USING NEXTED FOR LOOP STATAMENT

O/P: * * * * *






*/

class PatternProgram10 
{
	public static void main(String[] args) 
	{
		int n = 5; // this is the size for the matrix 5*5 rows&cols
		for (int i = 0; i < n ; i ++ ) // outer Loop for cols
		{
			for (int j = 0; j < n ; j ++ ) // inner Loop for rows
			{
				if (i==0)
				{
					System.out.print("* ");//give extra space for neat and clean O/P
				}else{
					System.out.print("  "); // how many chart we using give thta much emty space
				}
			}
			System.out.println(); // this is for seperate the * like row wise.. without this the o/p will be like **********
		}
	}
}
