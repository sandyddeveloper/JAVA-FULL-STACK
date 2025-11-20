class NoOfVowelsPresentInTheString 
{
	public static void main(String[] args) 
	{
		String words = "Testing";
		
		int count =0;
		
		for (int i = 0; i < words.length() ; i++ )
		{
			char ch = words.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		
		System.out.println("The Count : " + count);
	}
	
}
