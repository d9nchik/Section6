import java.util.Scanner;

public class exercise20 {
    public static int countLetters(String s) {
        int letters = 0;
        for (int k = 0; k < s.length(); k++) {
            char symbol = s.charAt(k);
            if ((symbol <= 'z' && symbol >= 'a') || (symbol <= 'Z' && symbol >= 'A'))
                letters++;
        }
        return letters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter string: ");
        System.out.println("Letters: " + countLetters(input.nextLine()));
    }
}
