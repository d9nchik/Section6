public class exercise14 {
    public static void main(String[] args) {
        System.out.println("I\t\tm(i)");
        System.out.println("--------------");
        for (int k = 1; k <= 1000; k+=100) {
            System.out.printf("%-2d\t\t%-7.4f\n", k, m(k));
        }
    }
    public static double m(int i){
        double sum =0;
        for (int k=1; k<=i;k++){
            if (k%2==1){
                sum+=1.0/(2*k-1);
            }
            else
                sum-=1.0/(2*k-1);
        }
        return 4*sum;
    }
}
