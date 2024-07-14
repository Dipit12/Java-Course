import java.util.Arrays;

public class Varargs {
    public static void main(String[] args){
        fun(1,2,3,4,4,5,2,24,2,5,2,4,5);
    }

    static void fun(int ...v){  // to pass unlimited parameters
        System.out.println(Arrays.toString(v));
    }
}
