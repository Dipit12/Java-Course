import java.util.Scanner;



public class intro {
    // In java functions are also called methods
    // functions that are mentioned in a class are mentioned as Methods, thus in java functions are termed as methods
    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the 2 number is " + sum);
    }

    static int sum2(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args){
        sum();
        System.out.println(sum2(7,8));

    }
}
