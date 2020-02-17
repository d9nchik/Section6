import java.util.Scanner;

public class exercise7 {
    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double amount = input.nextDouble();
        System.out.print("Annual interest rate: ");
        double rate = input.nextDouble();

        double monthRate = rate / 1200;

        System.out.println("Years\t\tFuture Value");
        for (int k = 1; k <= 30; k++) {
            System.out.printf("%-5d\t\t%12.2f\n", k, futureInvestmentValue(amount, monthRate, k));
        }
    }
}
