public class exercise32 {
    public static int rolling() {
        int a = (int) (Math.random() * 6) + 1;
        int b = (int) (Math.random() * 6) + 1;
        return a + b;
    }

    public static int playGame() {
        int number = rolling();
        if (number == 2 || number == 3 || number == 12) {
            return 0;
        } else if (number == 7 || number == 11) {
            return 1;
        } else {
            int point = number;
            do {
                number = rolling();
            } while (number != point && number != 7);

            if (number == point) {
                return 1;
            } else
                return 0;
        }
    }

    public static void main(String[] args) {
        int winningGames = 0;
        for (int k = 0; k < 15_000; k++)
            winningGames += playGame();

        System.out.println("Number of winning games is " + winningGames);
    }
}
