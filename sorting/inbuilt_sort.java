import java.util.Arrays;
import java.util.Collections;
public class inbuilt_sort {
    public static void main(String[] args) {
        int arr[] = {9,5,6,7,8,1,3};//
        Arrays.sort(arr,2,5);

        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        Integer a[] = {-10,-20,-30,0,100,20,3};

        Arrays.sort(a,Collections.reverseOrder());

        for(int i=0 ; i<arr.length ; i++) {
            System.out.print(a[i]+" ");
        }        

    }
}
