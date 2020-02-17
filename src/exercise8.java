public class exercise8 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t\t|\t\tKilometers\t\tMiles");
        System.out.println("----------------------------------------------------------");

        for (int k = 1; k <= 10; k++) {
            int i = 15 + 5 * k;
            System.out.printf("%-5d\t\t%-10.3f\t\t|\t\t%-10d\t\t%6.3f\n", k, mileToKilometer(k),
                    i, kilometerToMile(i));
        }
    }

    public static double mileToKilometer(double mile) {
        return mile * 1.6;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer / 1.6;
    }
}
