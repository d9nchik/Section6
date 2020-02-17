public class exercise11 {
    public static double computeCommission(double salesAmount) {
        if (salesAmount <= 5_000) {
            return salesAmount * 0.06;
        } else if (salesAmount <= 10_000) {
            return  (5_000 * 0.06 + (salesAmount - 5_000) * 0.08);
        } else
            return  (5_000 * 0.06 + 5_000 * 0.08 + (salesAmount - 10_000) * 0.1);
    }

    public static void main(String[] args) {
        System.out.println("Sales Amount\t\tCommission");
        System.out.println("------------------------------------");
        for (int x = 10_000; x <= 100_000; x += 5_000) {
            System.out.printf("%-12d\t\t%10.1f\n", x, computeCommission(x));
        }
    }
}
