import java.util.* ;

// this problem has 4 cases /4 varities 
//  <1> greater right 
//  <2> smaller right 
//  <3> greater left 
//  <4> smaller left


public class next_greater_element {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3} ;
        Stack<Integer> s = new Stack<>() ;

        int greaterArr[] = new int[arr.length] ;

        for(int i=arr.length-1 ; i>=0 ; i--){

            //step 1
            while(!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop() ;
            }

            // step 2
            if(s.isEmpty()){
                greaterArr[i] = -1 ;
            } else {
                greaterArr[i] = arr[s.peek()] ;
            }

            // step 3
            s.push(i) ;

        }

        for(int i=0 ; i<greaterArr.length ; i++){
            System.out.print(greaterArr[i]+" ");
        }
        System.out.println();

    }
}
