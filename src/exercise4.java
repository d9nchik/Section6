import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to revers: ");
        reverse(input.nextInt());

    }

    public static void reverse(int number) {
        int palindrome = 0;
        while (number != 0) {
            palindrome *= 10;
            palindrome += number % 10;
            number /= 10;
        }
        System.out.println(palindrome);
    }
}
