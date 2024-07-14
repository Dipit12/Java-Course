public class shadowing {
    static int x = 10;
    public static void main(String[] args){
        System.out.println(x); // 10
        int x = 40;
        System.out.println(x); // 40, the x defined inside the main function would shadow the x defined outside the function
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
