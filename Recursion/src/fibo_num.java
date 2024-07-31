public class fibo_num {
    public static void main(String[] args) {
        // find the nth fibo num
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        // base condition
        if(n==0){
            //System.out.println(0);
            return 0;
        }
        if(n==1){
            //System.out.println(1);
            return 1;
        }
       return fibo(n-1) + fibo(n-2); // recurrence relation
    }
}
