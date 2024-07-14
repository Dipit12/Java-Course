public class swap {
    static void swap(int a, int b){
        System.out.println("Originally a is " + a + "and b is " + b);
        int temp = a;
        a=b;
        b = temp;
        System.out.println("Now a is " + a + "and b is " + b);
    }
    public static void main(String[] args){
        swap(3,4);
    }
}
