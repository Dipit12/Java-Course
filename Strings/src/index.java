public class index {
    public static void main(String[] args) {
        // Creating different objects of same value
        String a = new String("Dipit");
        String b = new String("Dipit");
        System.out.println(a==b); // would return false

        // another way to compare
        System.out.println(a.equals(b));
        // to print a certain index of a string
        System.out.println(a.charAt(0));
    }
}
