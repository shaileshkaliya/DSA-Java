import java.util.HashMap;
public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,3,3,4} ;
        int mxaFreq = arr.length/3 ;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(map.get(i), 0)+1);
        }

        for(int key : map.keySet()){
            if(map.get(key)>=mxaFreq){
                System.out.print(key+" ");
            }
        }
    }
}
