public class count_sort {

    public static void CountSort(int a[]) {
        int min = Integer.MIN_VALUE ;
        for(int i=0 ; i<a.length ; i++){
            if(min < a[i]) {
                min = a[i];
            }
        }

        int count[] = new int[min+1];

        for(int i=0 ; i<a.length ; i++) {
            count[a[i]]++;
        }

        //Displaying count array 

        // for(int i=0 ; i<count.length ; i++) {
        //     System.out.print(count[i]+" ");
        // }
        
        int j=0;
        for(int i=0 ; i<count.length ; i++){
            while(count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }

        for(int i=0 ; i<a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,9,1,3,6};//0 1 0 3 0 5 6 0 0 9
        CountSort(arr);
    }
    
}
