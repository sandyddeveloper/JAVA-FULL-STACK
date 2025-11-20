/* Multiplication table of a given number */

class MultiplicationTable  
{
	public static void main(String[] args) 
	{
		int x = 10;
		for (int i = 1; i<= x ; i++ )
		{
			System.out.println(i+ " x "+ x +" = " + (x*i));
		}
	}
}
