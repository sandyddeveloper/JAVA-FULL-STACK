/* Create an int array with size 4 and store elements and print the element by using for loop?
[travering the array with the help of for loop]  */
class  Arraytravering
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30 , 40};
		
		for (int i = a.length -1 ; i>=0 ; i-- )
		
		//for (int i=0; i < a.length-1 ; i++ )
		{
			System.out.println(a[i]);
		}
	}
}
