public class exercise12 {
    public static void printNumbers(int num1, int num2, int
            numberPerLine) {
        for (int k = num1; k <= num2; k++) {
            System.out.print(k + " ");
            if ((k - num1 + 1) % numberPerLine == 0)
                System.out.println();
        }

    }

    public static void main(String[] args) {
        printNumbers(1, 100, 10);
    }
}
