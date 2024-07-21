public class MultiDimensionArrays {
    public static void main(String[] args) {
        // declaration and initialization
//        int [][] arr = new int[3][3];
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0; i<3;i++){  // arr.length returns the row
            for(int j=0; j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
