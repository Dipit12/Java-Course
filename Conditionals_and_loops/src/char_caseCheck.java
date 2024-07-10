import java.util.Scanner;

public class char_caseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch<='z'){
            System.out.println("Lower case");
        }
        else if( ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper case");
        }
        else{
            System.out.println("You have enetered a special character");
        }
    }
}
