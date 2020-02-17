import java.util.Scanner;

public class exercise19 {
    public static boolean isValid(
            double side1, double side2, double side3) {
        return !(side1 >= (side2 + side3)) && !(side2 >= (side1 + side3)) && !(side3 >= (side1 + side2));
    }

    public static double area(
            double side1, double side2, double side3) {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three side: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (isValid(a, b, c)) {
            System.out.println("Area is equal " + area(a, b, c));
        } else
            System.out.println("Input is invalid!");
    }
}
