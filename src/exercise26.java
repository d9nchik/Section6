public class exercise26 {
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

    public static boolean isPrime(int number) {
        for (int k = 2; k < number; k++) {
            if (number % k == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int counter =0;
        int number =2;
        while (counter<120){
            if (isPalindrome(number)&&isPrime(number)){
                counter++;
                System.out.print(number+" ");
                if (counter%10==0){
                    System.out.print("\n");
                }
            }
            number++;
        }
    }
}
