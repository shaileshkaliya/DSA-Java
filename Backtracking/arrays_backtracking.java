public class arrays_backtracking {

    public static void display(int[] arr) {
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void BackTrackArray(int arr[] , int value , int i)
    {
        // base case
        if(i == arr.length)
        {
            display(arr);
            return ;
        }

        //recurssion
        arr[i] = value ; 
        BackTrackArray(arr, value+1, i+1);
        arr[i] = arr[i]-2 ;                          //backtracking step 

    }
    public static void main(String[] args) {
        int arr[] = new int[5] ;
        BackTrackArray(arr, 1, 0);
        System.out.println();
        display(arr);
    }

}
