// WAJP to Count the No of Vowels present in the given String
// I/P : Testing
// O/P : Vowels is 2


package Basic;

public class NoOfVowelsPresentInTheString {
	public static void main(String[] args) {
		String word = "Testing";
		int count = 0;
		
		for (int i = 0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		
		System.out.println("Vowels is " + count);
	}

}
 