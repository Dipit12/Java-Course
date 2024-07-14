public class method_overloading {
    public static void main(String[] args){
        fun(5);
        fun("Dipit");
        fun(2,10);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int i, int k){
        System.out.println(i+k);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
