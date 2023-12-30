public class DoublyLL {
    public class Node{
        int data ;
        Node prev ;
        Node next ;

        Node(int data){
            this.data = data ;
            this.prev = null ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;

    public static int size ;

    public void AddFirst(int data)
    {
        Node newNode = new Node(data) ;
        size++ ;
        if(head == null){
            head = tail = newNode ;
            return ;
        }

        newNode.next = head ;
        head.prev = newNode ;
        head = newNode ;
    }

    public void AddLast(int data)
    {   
        Node newNode = new Node(data) ;
        size++ ;
        if(head == null ){
            head = tail = newNode ;
            return ;
        }

        tail.next = newNode ;
        newNode.prev = tail ;
        tail = newNode ;
    }

    public void display()
    {
        if(head == null){
            System.out.println("Linked list is empty ");
            return ;
        }
        Node temp = head ;

        System.out.print("null -> ");
        
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.data+" -> ");
                break ;                
            }
            System.out.print(temp.data+" <-> ");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    public void RemovevFirst()
    {
        if(head == null){
            System.out.println("Linked list is already empty !");
            return ;
        }
        size-- ;
        if(head.next == null){
            head = tail = null ;
            return ;
        }
        Node temp = head.next ;
        head.next = null ;
        temp.prev = null ;
        head = temp ;

    }

    public void RemoveLast()
    {
        if(head == null){
            System.out.println("Linked list is already empty !");
            return ;
        }
        size --;
        if(head.next == null){
            head = tail = null ;
            return ;
        }
        Node temp = tail.prev ;
        temp.next = null ;
        tail.prev = null ;
        tail = temp ;

    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL() ;
        dll.AddFirst(10);
        dll.AddFirst(90);
        dll.AddLast(5);
        dll.AddLast(0);

        dll.display();

        System.out.println("Head : "+head.data+" , Tail : "+tail.data);

        dll.RemoveLast();
        dll.RemovevFirst();

        dll.display();

        System.out.println("Head : "+head.data+" , Tail : "+tail.data);
        System.out.println("Size of dll is : "+size );
    }
}
