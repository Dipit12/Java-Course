import java.util.Scanner;

public class fibonacci_num {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int nth_fibo_num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= nth_fibo_num){
            int temp = b;
            b = b +a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
