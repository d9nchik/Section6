import java.util.Scanner;

public class exercise21 {
    public static int getNumber(char uppercaseLetter) {
        if (uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C'
                || uppercaseLetter == 'a' || uppercaseLetter == 'b' || uppercaseLetter == 'c')
            return 2;
        else if (uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F'
                || uppercaseLetter == 'd' || uppercaseLetter == 'e' || uppercaseLetter == 'f')
            return 3;
        else if (uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I'
                || uppercaseLetter == 'g' || uppercaseLetter == 'h' || uppercaseLetter == 'i')
            return 4;
        else if (uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L'
                || uppercaseLetter == 'j' || uppercaseLetter == 'k' || uppercaseLetter == 'l')
            return 5;
        else if (uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O'
                || uppercaseLetter == 'm' || uppercaseLetter == 'n' || uppercaseLetter == 'o')
            return 6;
        else if (uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S'
                || uppercaseLetter == 'p' || uppercaseLetter == 'q' || uppercaseLetter == 'r' || uppercaseLetter == 's')
            return 7;
        else if (uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V'
                || uppercaseLetter == 't' || uppercaseLetter == 'u' || uppercaseLetter == 'v')
            return 8;
        else if (uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z'
                || uppercaseLetter == 'w' || uppercaseLetter == 'x' || uppercaseLetter == 'y' || uppercaseLetter == 'z')
            return 9;
        else
            return uppercaseLetter - '0';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String in = input.next();

        for (int k=0;k<in.length();k++){
            if (in.charAt(k)=='-')
                System.out.print('-');
            else
                System.out.print(getNumber(in.charAt(k)));
        }
    }
}
