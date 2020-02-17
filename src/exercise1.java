public class exercise1 {
    public static void main(String[] args) {
        for (int k =1; k<=100;k++){
            System.out.printf("%7d", getPentagonalNumber(k));
            if (k%10==0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }
}
