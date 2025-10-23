// WAJP to find the length of string and print the char of the String?
package Basic;

import java.util.*;
public class LengthOfString {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the String : ");
		String word = sc.next();
//		String word = "sadny";
		
		System.out.println("Length of the String is : " + word.length());
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(i+ " char is : " + word.charAt(i));
		}
		
	}

}
