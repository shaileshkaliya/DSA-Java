import java.util.ArrayList;
import java.util.LinkedList;

public class hashmapCode {

    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n;
        private int N; // N;
        private LinkedList<Node> bucket[] ; //N

        @SuppressWarnings("unchecked")  //  basicially to ignoree all warnings 

        public HashMap(){
            this.N = 4;
            this.bucket = new LinkedList[4];  // here that suppressed warning is used as we have to give datatype of linked list while declaring it in normal but here we didint do that thing.
            
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hashValue = key.hashCode();

            return Math.abs(hashValue)%N;
        }

        private int findLLIdx(K key, int bucketIdx){
            LinkedList<Node> ll = bucket[bucketIdx];
            int idx=0;

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return idx;
                }
                idx++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[2*N];
            N = 2*N;

            // initialize a new linked list for each position in newly size increased array
            for(int i=0;i<bucket.length;i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];

                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bucketIdx = hashFunction(key);
            int llIdx = findLLIdx(key, bucketIdx);

            if (llIdx != -1) {
                Node node = bucket[bucketIdx].get(llIdx);
                node.value = value;
            }else{
                bucket[bucketIdx].add(new Node(key,value));
                n++;
            }

            double lambda = (double)n/N;
 
            if(lambda > 2.0){  // compare it with a threshold value
                rehash();
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> arr = new ArrayList<>();

            for(int i=0;i<bucket.length;i++){
                LinkedList<Node> ll = bucket[i];
                for (Node node : ll) {
                    arr.add(node.key);
                }
            }
            return arr;
        }

        public V get(K key){
            int bucketIdx = hashFunction(key);
            int llIdx = findLLIdx(key, bucketIdx);

            if(llIdx != -1){
                return bucket[bucketIdx].get(llIdx).value;
            }
            return null;

        }

        public boolean containsKey(K key){
            int bucketIdx = hashFunction(key);
            int llIdx = findLLIdx(key, bucketIdx);

            if(llIdx != -1){
                return true;
            }
            return false;
        }

        public V remove(K key){
            int bucketIdx = hashFunction(key);
            int llIdx = findLLIdx(key, bucketIdx);

            if(llIdx != -1){
                Node node = bucket[bucketIdx].remove(llIdx) ;
                n--;
                return node.value;
            }

            return null;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("A",5);
        map.put("B",8);
        map.put("C",6);

        ArrayList<String> keys = map.keySet();

        for(String key:keys){
            System.out.println(map.get(key));
        }

        map.put("C",10);

        keys = map.keySet();

        for(String key:keys){
            System.out.println(map.get(key));
        }

    }
}
