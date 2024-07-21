public class intro {
    public static void main(String[] args) {
       /*
        Syntax
        datatype[] var_name = new datatype[size];
        */
        // declaration
        int[] something;
        // initialization
        something = new int[4];
        int[] roll_no = new int[5];
        // new keyword is used to create an object
        // in the above declaration( int[] roll_no) roll_no is getting defined in the stack -> done at compile time
        // new int[5], here the actual object is created in the heap -> done at runtime
        // initialization
        roll_no[2] = 10;

        // declaration and initialization
        int[] marks = {10, 20, 30, 40, 50};
        for(int i =0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.print("\n");
        // Dynamic memory allocation - memory is allocated at the run time
        // In java its' possible that memory might not be continous

        String[] arr = new String[4];
        System.out.println(arr[0]); // would give Null
        // null can be assigned to only non-primitive data types like strings, not to primitive data types like int


    }
}
