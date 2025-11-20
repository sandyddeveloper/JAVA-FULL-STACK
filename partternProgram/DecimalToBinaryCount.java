import java.util.Scanner;

public class DecimalToBinaryCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        // Step 2: Convert to binary
        String binary = Integer.toBinaryString(num);

        // Step 3: Count number of 1s
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        // Step 4: Display results
        System.out.println("Binary representation: " + binary);
        System.out.println("Number of 1s: " + count);

        sc.close();
    }
}
