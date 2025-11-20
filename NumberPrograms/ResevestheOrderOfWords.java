class ResevestheOrderOfWords 
{
	public static void main(String[] args) 
	{
		String sen = "How are you";
		String[] words = sen.split(" ");
		String rev = "";
		
		for (int i = words.length-1; i>=0 ; i-- )
		{
			rev = rev+words[i]+" "; // storing in a variable..
			System.out.print(words[i] + " "); // without storing in another variable.. 
		}
		
		System.out.println(rev);
	}
}
