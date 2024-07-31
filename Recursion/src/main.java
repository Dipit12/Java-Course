public class main {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        // Condition: you can call only 1 function in the main function
        num1(1);
        // recursion refers to a function calling itself

    }
    static void num1 (int n){
        System.out.println(n);
        num2(2);
        // we can see that a function is calling another function in its body
    }
    static void num2 (int n){
        System.out.println(n);
        num3(3);
    }
    static void num3 (int n){
        System.out.println(n);
        num4(4);
    }
    static void num4 (int n){
        System.out.println(n);
        num5(5);
    }
    static void num5 (int n){
        System.out.println(n);
    }
}
