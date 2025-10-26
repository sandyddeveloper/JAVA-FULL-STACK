// WAJP to reserver a String
package Basic;

import java.util.Scanner;

public class ToReverseAString {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the String: ");
		
		String word = sc.next();
		// take the end index of the char so-> word.length()-1;
		// if i execute like this then the o/p like y d n a s in next line
		// for overcome this we will store the reversed words in a container
		
		String rev = "";
		
		for (int i = word.length()-1; i>=0 ; i--) {
			rev = rev+word.charAt(i); // "" + char = String ; integer + String = String ; goes on
		} 
		
		System.out.println(rev);
	}

}
