
public class container_with_most_water {

    public static int largeContainer(int arr[])       // Time complexity is O(n^2) 
    {
        int maxWater = 0 ;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if((j-i)*Math.min(arr[i],arr[j]) >= maxWater){
                    maxWater = (j-i)*Math.min(arr[i],arr[j]) ;
                }
            }
        }
        return maxWater ;
    }


    //This is called 2 pointer approach 
    //Time complexity is O(n) i.e. linear TC

    public static int optimizedLargeContainer(int arr[])
    {
        int leftPtr = 0 ;
        int rightPtr = arr.length-1 ;
        int maxWater = 0 ;

        while(leftPtr < rightPtr) {
            if(maxWater <= ((rightPtr-leftPtr)*Math.min(arr[leftPtr], arr[rightPtr])))
            {
                maxWater = (rightPtr-leftPtr)*Math.min(arr[leftPtr], arr[rightPtr]) ;
            }
            if(arr[leftPtr] < arr[rightPtr])
            {
                leftPtr++ ;
            }
            else {
                rightPtr-- ;
            }
        }
        return maxWater ;
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7} ;
        System.out.println(largeContainer(height));
        System.out.println();
        System.out.println("Output with optimized code is : "+optimizedLargeContainer(height));
    }
}
