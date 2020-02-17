public class exercise24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;

        long totalDays = totalHours / 24;

        System.out.print(getNumberOfYearAndMonth(totalDays) + " " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;
        return 0; // If month is incorrect
    }

    public static String getNumberOfYearAndMonth(long days) {
        int year = 1970;
        while (true) {
            if (isLeapYear(year)) {
                if (days > 366) {
                    days -= 366;
                    year++;
                } else
                    break;
            } else {
                if (days > 365) {
                    days -= 365;
                    year++;
                } else break;
            }
        }

        days++;

        int month = 1;
        while (true) {
            if (days - getNumberOfDaysInMonth(year, month) > 0) {
                days -= getNumberOfDaysInMonth(year, month);
                month++;
            } else
                break;
        }
        String output = year + " ";

        switch (month) {
            case 1:
                output += "January";
                break;
            case 2:
                output += "February";
                break;
            case 3:
                output += "March";
                break;
            case 4:
                output += "April";
                break;
            case 5:
                output += "May";
                break;
            case 6:
                output += "June";
                break;
            case 7:
                output += "July";
                break;
            case 8:
                output += "August";
                break;
            case 9:
                output += "September";
                break;
            case 10:
                output += "October";
                break;
            case 11:
                output += "November";
                break;
            case 12:
                output += "December";
        }
        output += " " + days;
        return output;
    }
}
