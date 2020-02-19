public class exercise38 {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static void main(String[] args) {
        for (int k = 0; k < 200; k++) {
            System.out.print(getRandomUpperCaseLetter() + " ");
            if (k % 10 == 9)
                System.out.println();
        }

        System.out.println();

        for (int k = 0; k < 200; k++) {
            System.out.print(getRandomDigitCharacter() + " ");
            if (k % 10 == 9)
                System.out.println();
        }
    }
}
