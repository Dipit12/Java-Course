import java.util.Scanner;

public class largest_num {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && a>c){
            System.out.println("Greatest number is " + a);
        }
        else if(b>a && b>c){
            System.out.println("Greates number is " + b);

        }
        else{
            System.out.println("Greatest number is " + c);
        }
    }
}
