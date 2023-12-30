import java.time.chrono.IsoEra;

public class circularQueue {

    static class Queue {
        static int arr[] ;
        static int front ;
        static int rear ;
        static int size ;

        Queue(int n){
            arr = new int[n] ;
            size = n ;
            front = -1 ;
            rear = -1 ;
        }

        public static boolean isEmpty()
        {
            return rear == -1 && front == -1 ;
        }

        public static boolean isFull(){
            return (rear+1)%size == front ;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full ");
                return ;
            }

            if(front == -1){
                front = 0 ;
            }

            rear = (rear+1)%size ;
            arr[rear] = data ;

        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1 ;
            }

            int temp = arr[front] ;
            front = (front+1)%size ;

            if(rear == front ){
                rear = front = -1 ;
            }
            return temp ;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1 ;
            }

            return arr[front] ;
        }
    }

    public static void main(String[] args) {
        
        Queue q = new Queue(5) ;
        q.add(5) ;
        q.add(6) ;
        q.add(7) ;

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
