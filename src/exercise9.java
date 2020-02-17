public class exercise9 {
    public static void main(String[] args) {
        System.out.println("Kilograms\t\tPounds\t\t|\t\tPounds\t\tKilograms");
        System.out.println("----------------------------------------------------------");

        for (int k = 1; k < 200; k+=2) {
            int i = 20 + 5 *( k/2);
            System.out.printf("%-9d\t\t%-6.3f\t\t|\t\t%-6d\t\t%9.3f\n", k, poundToKilogram(k),
                    i, kilogramToPound(i));
        }
    }

    public static double poundToKilogram(double pound) {
        return pound * 2.204;
    }

    public static double kilogramToPound(double kilogram) {
        return kilogram * 0.453;
    }
}
