// WAJP to check the given String is Palindrome or not
package Basic;

import java.util.Scanner;

public class Palindrome {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the String : ");
		
		String word = sc.next();
		String rev = ""; // don't give any space 
		
		for(int i = word.length()-1; i>=0; i--) {
			rev = rev+word.charAt(i);
		}
		if(rev.equals(word)) { // in this method it will also compare the caps and small letter differences also to avoid this we can use equalsIgnoreCase() method.
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its is not a Palindrome");
		}
		
		// equalsIgonoreCase()
		if(rev.equalsIgnoreCase(word)) { 
			System.out.println("Its Palindrome");
		}else {
			System.out.println("Its is not a Palindrome");
		}
		
	}

}
