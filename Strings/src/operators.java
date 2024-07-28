import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // would return 195 - ASCII value
        System.out.println("a" + "b"); // would print ab
        System.out.println('a' +3); // returns a ASCII value
        System.out.println((char)('a' +3)); // returns d

        System.out.println("a" +3); // would return a3, since 3 would be converted into a string
        // Every object is converted into a string using toString() and then concatenated with a string
        System.out.println("Dipit" + new ArrayList<>()); // would print Dipit[]
       // System.out.println("Dipit" + new Integer(56)); // would print Dipit56
        // error -> System.out.println(new Integer(56) + System.out.println(new ArrayList<>()) wouldnt convert them to string using toString(), because for a + operator to work atleast one object should be a string
      //  System.out.println("Dipit" * 3); -> * operator is not defined for string, neither are '-' or '/'

    }
}
