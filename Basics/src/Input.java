import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll no");
        int roll_no = input.nextInt();
        System.out.println("Your roll number is " + roll_no);

        String name = input.next();
        System.out.println(name);

        // program to find sum of 2 numbers
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum is " + sum);
    }
}
