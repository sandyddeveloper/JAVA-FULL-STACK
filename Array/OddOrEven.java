/* Count even & odd numbers in array */

class OddOrEven
{
	public static void main(String[] args) 
	{
		int[] arr = {45,87,21,22,6,8,4,3,7,4,6,6,4,44};
		
		int Even = 0;
		int Odd = 0;
		
		for (int i =0; i<arr.length ;  i++){
			if (arr[i] % 2 == 0)
			{
				Even++;
			}else{
				Odd++;
			}
		}
		
		System.out.println(Even);
		System.out.println(Odd);
	}
}
