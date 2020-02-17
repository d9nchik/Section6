public class exercise13 {
    public static void main(String[] args) {
        System.out.println("I\t\tm(i)");
        System.out.println("--------------");
        for (int k = 1; k <= 20; k++) {
            System.out.printf("%-2d\t\t%-7.4f\n", k, m(k));
        }
    }

    public static double m(int i) {
        double result = 0;

        for (int k = i; k > 0; k--) {
            result += (k / (double) (k + 2));
        }
        return result;
    }

}
