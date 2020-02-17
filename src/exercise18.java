import java.util.Scanner;

public class exercise18 {
    public static void isPassValid(String password){
        if (password.length()<10){
            System.out.println("Invalid Password");
            return;
        }
        int digits =0;
        for (int x=0; x<password.length();x++){
            char symbol =password.charAt(x);
            if(symbol<='9'&&symbol>='0'){
                digits++;
            }
            else if(!((symbol<='z'&&symbol>='a')||(symbol<='Z'&&symbol>='A'))){
                System.out.println("Invalid Password");
                return;
            }
        }

        if (digits>=3){
            System.out.println("Valid Password");
        }
        else
            System.out.println("Invalid Password");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        isPassValid(input.next());
    }
}
