import java.util.*;

// MAX HEAP 

public class heap_implementation {
    static ArrayList<Integer> arr = new ArrayList<>();

    static class Heap {
        public void add(int data) {
            arr.add(data);
            int child = arr.size() - 1;
            int par = (child - 1) / 2;

            while (arr.get(child) < arr.get(par)) {
                // swap

                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (child - 1) / 2;
            }
        }

        public static int peek() {
            return arr.get(0);
        }

        private static void heapify(int idx) {
            int left = 2 * idx + 1;
            int right = 2 * idx + 2;
            int minIdx = idx;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != idx) {
                // swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public static int remove() {

            // step 1 : Swap the first and last integer
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // step 2 : delete th last integer
            arr.remove(arr.size() - 1);

            // step 3 : heapify()
            heapify(0);

            return temp;
        }

        public static boolean isEmpty(){
            return arr.size()==0;
        }

    }

    public static void main(String[] args) {
        Heap pq = new Heap();

        pq.add(5);
        pq.add(0);
        pq.add(54);
        pq.add(2);

        while(!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}
