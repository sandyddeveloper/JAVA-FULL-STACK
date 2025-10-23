import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;  // assume it's prime

        if (num <= 1) {
            isPrime = false;  // numbers <= 1 are not prime
        } 
        else {
            // simpler for loop
            for (int i = 0; i < num; i++) {   
                if (num % 2 == 0) {          
                    isPrime = false;
                    break;                    // stop checking
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number.");
        else
            System.out.println(num + " is not a Prime Number.");
    }
}
