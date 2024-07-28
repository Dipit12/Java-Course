import java.util.Arrays;

public class stringMethods {
    public static void main(String[] args) {
        String name = "Dipit Madan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('M'));
        System.out.println("   Dipit    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.split("i")));
    }
}
