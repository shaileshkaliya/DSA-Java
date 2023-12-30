public class heapSort {

    public static void heap_sort(int[] arr){    // TC = O(NlonN)
        int n = arr.length;

        // max heap building for ascending order sorting
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        // step 2 : swapping of nodes

        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }

    private static void heapify(int[] arr, int idx, int size){
        int maxIdx = idx;
        int left = 2*idx+1;
        int right = 2*idx+2;

        if(left < size && arr[left] > arr[maxIdx]){
            maxIdx = left;
        }
        if(right < size && arr[right] > arr[maxIdx]){
            maxIdx = right;
        }

        if(idx != maxIdx){
            // swap
            int temp = arr[idx];
            arr[idx] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapify(arr,maxIdx,size);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,5,3};

        heap_sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
