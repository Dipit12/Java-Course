import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int variable = in.nextInt();
        // for loop
        /*
            Syntax
            for(initialization; condition; increment/decrement){
                // execute this code
            }
         */
        for(int i=0;i<5;i++){
            System.out.println(variable);
        }

        // While loop
        /*
            while(condition){
                // body of code
                // code would be executed till the condition provided is true
            }
         */
        int j = 0;
        while(j <5){
            System.out.println("Printing something");
            j++;
        }
        // For vs While - which loop should we use
        // When we know the number of iteration, we use for loop, when we dont the number of iterations we use while loop
        //

        // Do while loop
        /*
        Syntax:
            do{
                while(condition);
            }
         */
        int n = 1;
        do{
           System.out.println(n);
           n++;
        } while(n < 6);
        // a do while loop executes atleast once
    }
}
