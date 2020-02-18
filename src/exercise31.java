import java.util.Scanner;

public class exercise31 {
    public static int getSize(long d) {
        int counter = 0;
        while (d != 0) {
            counter++;
            d /= 10;
        }
        return counter;
    }

    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size < k)
            return size;

        for (int i = 0; i < (size - k); i++) {
            number /= 10;
        }
        return number;
    }

    public static boolean prefixMatched(long number, int d) {
        long digit = getPrefix(number, 1);
        return digit == d || getPrefix(number, 2) == d;
    }

    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 100;
        }
        return sum;
    }

    public static int getDigit(int number) {
        if (number < 10)
            return number;
        return (number % 10) + (number / 10);
    }

    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        while (number != 0) {
            number /= 10;
            sum += getDigit((int) (number % 10) * 2);
            number /= 10;
        }
        return sum;
    }

    public static boolean isValid(long number) {
        int size = getSize(number);
        int checksum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        checksum %= 10;
        return (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
                || prefixMatched(number, 6)) && size >= 13 && size <= 16 && checksum == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer:");
        long number = input.nextLong();

        System.out.print(number + " is ");
        if (!isValid(number))
            System.out.print("in");
        System.out.println("valid");
    }
}
