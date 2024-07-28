public class palindrome_check {
    public static void main(String[] args) {
        // palindrome - reads same backwards
        String name = "abcdcba";
        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String word) {

        word = word.toLowerCase();
        if(word.length()==0 || word == null ){
            return true;

        }
        int s = 0;
        int e = word.length() - 1;
        while (s <= e) {
            if (word.charAt(s) != word.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
