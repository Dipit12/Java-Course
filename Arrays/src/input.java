import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int j = 0; j<arr.length;j++){
            arr[j] = in.nextInt();
        }
        // printing the elements out
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }

        // Another way to print the elements of array -> using for each loop
        for(int num: arr){
            System.out.println(num);
        }
        // Printing array using toString() method
        System.out.println(Arrays.toString(arr));
    }
}
