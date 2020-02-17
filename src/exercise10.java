public class exercise10 {

    public static void main(String[] args) {
        System.out.print("The number of prime numbers less than 10_000 are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (number < 10000) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                count++; // Increase the count
            }

            // Check whether the next number is prime
            number++;
        }
        System.out.print(count);
    }

    /**
     * Check whether number is prime
     */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }

        return true; // Number is prime
    }
}
