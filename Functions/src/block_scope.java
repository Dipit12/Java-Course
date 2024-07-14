public class block_scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        {
             a = 89;
             int c = 99;

        }
       //  System.out.println(c); -> given an error, since values that are initialized in a block, there scope is limited to that block only
        // Anything initialized in the block cannot be used outside, but anything initialized outside can be used inside the block
        System.out.println(a); // would print 89
        random(10);


       // Scoping in for loop
       for(int i =0; i<5;i++){
           System.out.println(i);
       }
      //System.out.println(i); -> would give an error -> since i is not defined outside the for loop
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
