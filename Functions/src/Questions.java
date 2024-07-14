public class Questions {
    public static void main(String[] args){
        System.out.println(is_prime(19));
        System.out.println(armStrong(153));
    }
    static boolean is_prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }

        }
        return true;
    }

    static boolean armStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;

        }
        if (sum == original) {
            return true;
        }
        return false;
    }
}
