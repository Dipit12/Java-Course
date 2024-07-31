public class main_efficient {
    public static void main(String[] args) {
        // this is the efficient code of the file main.java
        print_num(1);
    }
    static void print_num(int n){
       if(n==5){
           System.out.println(5);
           return;
       }
       System.out.println(n);
       print_num(n+1); // function calling itself
    }
}
