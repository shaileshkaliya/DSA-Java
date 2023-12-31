
public class queueImplementArray {

    static class Queue {
        static int arr[] ;
        static int size ;
        static int rear ;
        Queue(int n){
            arr = new int[n] ;
            size = n ;
            rear = -1 ;
        }

        public static boolean isEmpty(){
            return rear == -1 ;
        }
        
        public static void add(int data){
            if(rear == size-1 ){
                System.out.println("Queue is full ");
                return ;
            }
            rear++ ;
            arr[rear] = data ;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = arr[0] ;
            for(int i=0 ; i<arr.length-1 ; i++){
                arr[i] = arr[i+1] ;
            }
            rear-- ;
            return temp ;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1 ;
            }
            return arr[0] ;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5) ;
        q.add(10) ;
        q.add(20);
        q.add(30);

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
