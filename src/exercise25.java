import java.util.Scanner;

public class exercise25 {
    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        return currentHour + ":" + currentMinute + ":" + currentSecond;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a milliseconds: ");
        long millis = input.nextLong();

        System.out.print(convertMillis(millis));
    }
}
