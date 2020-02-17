public class exercise16 {
    public static int numberOfDaysInAYear(int year){
        if((year%4==0&&year%100!=0)||year%400==0)
            return  366;
        else
            return 365;
    }

    public static void main(String[] args) {
        for (int year =2014;year<=2034;year++){
            System.out.println(year+" - " +numberOfDaysInAYear(year)+" days");
        }
    }
}
