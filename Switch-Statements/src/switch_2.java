import java.util.Scanner;

public class switch_2 {
    // Nested switch case
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int empID  = in.nextInt();
        String Department = in.next();

        switch(empID){
            case 1:
                System.out.println("Dipit madan");
                break;
            case 2:
                System.out.println("Tithi Shah");
                break;
            case 3:
                switch(Department){
                    case "IT":
                        System.out.println("You are in IT department");
                        break;
                    case "Management":
                        System.out.println("You are in Management Department");
                        break;

                }
            default:
                System.out.println("Invalid EmpID mentioned");
        }
    }
}
