import java.util.Scanner;

public class exercise5 {
    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " ");
            if (num2 >= num3)
                System.out.println(num2 + " " + num3);
            else
                System.out.println(num3 + " " + num2);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + " ");
            if (num1 >= num3) {
                System.out.println(num1 + " " + num3);
            } else
                System.out.println(num3 + " " + num1);
        } else if (num1 >= num2)
            System.out.println(num3 + " " + num1 + " " + num2);
        else
            System.out.println(num3 + " " + num2 + " " + num1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть 3 числа: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        displaySortedNumbers(a, b, c);
    }
}
