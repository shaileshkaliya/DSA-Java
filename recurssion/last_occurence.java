public class last_occurence {

    public static int LastOccurence(int arr[],int key,int i) {

        if(i == arr.length) {
            return -1 ;
        }

        int isFound = LastOccurence(arr, key, i+1) ;
        
        // if(isFound != -1) {
        //     return isFound;
        // }

        if(isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,4,6};
        System.out.println(LastOccurence(arr, 11, 0));
    }
}
