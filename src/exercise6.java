public class exercise6 {
    public static void displayPattern(int n){
        for (int k=1; k<=n;k++){
            for (int j =k;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(10);
    }
}
