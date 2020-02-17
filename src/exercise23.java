import java.util.Scanner;

public class exercise23 {
    public static int count(String str, char a) {
        int counter = 0;
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == a)
                counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        String str = input.nextLine();
        System.out.print("Введіть букву: ");
        char letter = input.next().charAt(0);

        System.out.println("Буква " + letter + " трапляється " + count(str, letter) + " разів");
    }
}
