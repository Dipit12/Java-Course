import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        // Dynamic arrays are used when we dont know the size of the array
        // Also called ArrayList, similar to vectors in C++
        // Syntax
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(12);
        list.add(90);
        list.add(100);
        list.add(11);
        list.add(12);
        list.add(90);
        list.add(100);
        list.add(11);
        list.add(12);
        list.add(90);
        list.add(100);
        list.add(11);
        list.add(90);
        list.add(100);
        list.add(11);
        list.add(12);
        list.add(90);
        list.add(100);
        list.add(11);
        list.add(12);
        list.add(90);
        list.add(100);
        list.add(11);

        System.out.println(list.contains(89));
        list.set(0,120); // would change the 0th index to 99
        list.remove(2);// would remove the 2th index
        System.out.println(list);

        // input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        System.out.println(list);
    }
}
