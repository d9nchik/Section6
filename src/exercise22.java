public class exercise22 {
    public static double sqrt(long n) {
        double lastGuess;
        double nextGuess=1;
        do {
            lastGuess=nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        } while (Math.abs(nextGuess - lastGuess) > 0.0001);
        return nextGuess;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(2));
    }
}
