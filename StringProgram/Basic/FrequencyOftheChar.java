// WAJP to find the Frequency of a Char
package LevelTwo;

public class FrequencyOftheChar {
	public static void main(String[] args) {
		String word = "Ramana";
		int count = 0;
		char ch = 'a';
		for(int i = 0; i<word.length(); i++) {
			char letter = word.charAt(i);
			if(letter == ch) {
				count ++;
			}
		}
		System.out.println(ch+ "-->"+count);
	}
}
