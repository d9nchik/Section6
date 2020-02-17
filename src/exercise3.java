public class exercise3 {
    public static int reverse(int number) {
        int palindrome = 0;
        while (number != 0) {
            palindrome *= 10;
            palindrome += number % 10;
            number /= 10;
        }
        return palindrome;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(232));
        System.out.println(isPalindrome(234));
    }
}
