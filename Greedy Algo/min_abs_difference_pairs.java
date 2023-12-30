import java.util.Arrays;

public class min_abs_difference_pairs {
    public static void main(String[] args) {
        int[] a = {4,1,8,7};
        int b[] = {2,3,6,5};

        int diff = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            int temp = Math.abs(a[i]-b[i]);
            diff += temp;
        }

        System.out.println("Maximum absolute difference is "+diff);
    }
}
