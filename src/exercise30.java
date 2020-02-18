public class exercise30 {
    public static int rolling() {
        int a = (int) (Math.random() * 6) + 1;
        int b = (int) (Math.random() * 6) + 1;
        int sum = a + b;
        System.out.println("You rolled " + a + " + " + b + " = " + (sum));
        return sum;
    }

    public static void main(String[] args) {
        int number = rolling();
        if (number == 2 || number == 3 || number == 12) {
            System.out.println("You lose");
        } else if (number == 7 || number == 11) {
            System.out.println("You win");
        } else {
            int point = number;
            System.out.println("Your point is " + point);
            do {
                number = rolling();
            } while (number != point && number != 7);

            if (number == point) {
                System.out.println("You win");
            } else
                System.out.println("You lose");
        }
    }
}
