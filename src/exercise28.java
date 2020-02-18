public class exercise28 {
    public static int mersennePrimes(int p) {
        return (int) Math.pow(2, p) - 1;
    }

    public static boolean isPrime(int number) {
        for (int k = 2; k < number; k++) {
            if (number % k == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("p\t\t\t2^p-1");
        System.out.println("-------------------------");
        for (int p = 2; p <= 31; p++) {
            int number = mersennePrimes(p);
            if (isPrime(number))
                System.out.printf("%-2d\t\t\t%-2d\n", p, number);
        }
    }
}
