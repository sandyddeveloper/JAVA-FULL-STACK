/* Swap two numbers without using a third variable */

class  SwapTwoNumber
{
	public static void main(String[] args) 
	{
		int a = 20; 
		int b = 30;
		
		System.out.println("A = " + a + " " + "B = " + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("A = " + a + " " + "B = " + b);
		
	}
}
