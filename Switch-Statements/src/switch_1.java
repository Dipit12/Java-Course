import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit  = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Fruit containing Vitamin C");
                break;
            case "Apple":
                System.out.println("a sweet red fruit");
                break;
            default:
                System.out.println("Invalid name written");

        }

        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number given");
        }
    }
}
