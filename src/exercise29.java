public class exercise29 {
    public static boolean isPrime(int number) {
        for (int k = 2; k < number; k++) {
            if (number % k == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int k = 2; k < 1200; k++) {
            if (isPrime(k) && isPrime(k + 2)) {
                System.out.println("(" + k + ", " + (k + 2) + ")");
            }
        }
    }
}
