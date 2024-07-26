public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // would return 195 - ASCII value
        System.out.println("a" + "b"); // would print ab
        System.out.println('a' +3); // returns a ASCII value
        System.out.println((char)('a' +3)); // returns d

        System.out.println("a" +3); // would return a3, since 1 would be converted into a string

    }
}
