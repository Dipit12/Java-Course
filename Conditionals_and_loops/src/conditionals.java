import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){
        /*
        Syntax
        if(condtion){
            //if condition is true, execute this part of code
        }
        else{
            // if the condition under the if part is false, then this code would be executed

        }
         */
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();

        if(salary>=10000 && salary < 15000){
            salary += 2000;
            System.out.println("Your salary included with the bonus amounts to" + salary);
        }

        else if (salary > 5000 && salary<10000){
            salary += 1000;
            System.out.println("Your salary included with the bonus of this year amounts to" + salary);
        }

        else{
            System.out.println("You didnt get any bonus this year, so youre salary is" + salary);
        }
    }
}
