public class insertion_sort {

    public static void InsertionSort(int a[]) {
        for(int i=1 ; i<a.length ; i++) {
            int curr = a[i];
            int prev = i-1;
            while(prev >= 0 && a[prev] > curr) {
                a[prev+1] = a[prev] ;
                prev--;
            }
            a[prev+1] = curr;
        }

        System.out.println("Sorted array is : ");
        for(int i=0 ; i<a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,6,9,2,3};
        InsertionSort(arr);
    }
}
