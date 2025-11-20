public class LargestPalindromeProduct {
    public static void main(String[] args) {
        int largest = 0;      // to store the largest palindrome
        int num1 = 0;         // first number
        int num2 = 0;         // second number

        // loop through all 3-digit numbers
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;

                // check if the product is a palindrome
                if (isPalindrome(product) && product > largest) {
                    largest = product;
                    num1 = i;
                    num2 = j;
                }
            }
        }

        // print the largest palindrome and the numbers
        System.out.println("Largest palindrome: " + largest);
        System.out.println("Formed by " + num1 + " x " + num2);
    }

    // method to check if a number is palindrome using string
    public static boolean isPalindrome(int number) {
        String str = Integer.toString(number);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
