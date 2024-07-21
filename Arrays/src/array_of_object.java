import java.util.Arrays;
import java.util.Scanner;

public class array_of_object {
    public static void main(String[] args) {
        // array of objects
        String[] str = new String[4];
        Scanner in = new Scanner(System.in);
        for(int i=0;i< str.length;i++){
            str[i]  = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[0] = "Dipit Madan";
        System.out.println(Arrays.toString(str));
    }
}
