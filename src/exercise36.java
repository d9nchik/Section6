import java.util.Scanner;

public class exercise36 {
    public static double area(int n, double side) {
        return n * side * side / 4 / Math.tan(Math.PI / n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of polygon is " + area(n, side));
    }
}
