// in java the name of class should be same as the name of the file saved with the .java ext


import java.util.Scanner;

public class main{
    // public static void main(String[] args) is equivalent to int main() in C++
    public static void main(String[] args){
        System.out.println("Hello world");

        // Taking inputs in Java
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.println(a);
        System.out.println(input.nextLine());
    }
}