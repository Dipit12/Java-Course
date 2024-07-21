import static java.util.Collections.swap;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start =0;
        int end = (arr.length)-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

}
