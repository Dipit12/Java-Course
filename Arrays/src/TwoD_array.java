import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        // Taking an input of 2D array and then printing it
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of an array");

        int n1 = in.nextInt();
        int [][] arr = new int[n1][];
        // taking input
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        // printing the output
        for(int m=0;m<arr.length;m++){
            for(int n=0; n<arr[m].length;n++){
                // for col in each row
                System.out.println(arr[m][n] + " ");
            }
            System.out.println("\n");
        }
    }
}
