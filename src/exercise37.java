import java.util.Scanner;

public class exercise37 {
    public static String format(int number, int width) {
        String strNumber = String.valueOf(number);
        if (strNumber.length() >= width) {
            return strNumber;
        }
        return "0".repeat(Math.max(0, (width - strNumber.length()))) +
                strNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();
        System.out.print("Result is " + format(number, width));
    }
}
