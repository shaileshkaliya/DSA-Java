
public class implement_LinkedList {
    static class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    static class Queue{
        static Node head = null ;
        static Node tail = null ;

        public static boolean isEmpty(){
            return head == null ;
        }

        public static void add(int data){
            Node newNode = new Node(data) ;
            if(head == null){
                head = tail = newNode ;
                return ;
            }
            tail.next = newNode ;
            tail = newNode ;
        }

        public static int remove(){
            if(head == null){
                System.out.println("Queue is empty ");
                return -1 ;
            }
            
            int temp = head.data ;
            head = head.next ;
            return temp ;
        }

        public static int peek(){
            if(head == null){
                System.out.println("Queue is empty ");
                return -1 ;
            }

            return head.data ;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue() ;
        q.add(50) ;
        q.add(30) ;
        q.add(10) ;

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
