public class zigzag_ll {

    public class Node{
        int data;
        Node next ;
        Node(int data){
            this.data = data ;
            next = null ;
        }
    }

    public static Node head ;
    public void addAtHead(int data)          //TC is O(1)
    {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;

    }

    public void display()
    {
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    
    private Node findMid()
    {
        Node slow = head ;
        Node fast = head.next ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }
    public void zigzag(){
        // find mid
        Node mid = findMid() ;

        // reverse second half
        Node curr = mid.next ;
        mid.next = null ;
        Node prev = null ;
        Node next ;

        while(curr != null){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }
        Node right = prev ;
        Node left = head ;

        Node nextL,nextR ;
        // alt merge 

        while(left != null && right != null){
            nextL = left.next ;
            left.next = right ;

            nextR = right.next ;
            right.next = nextL ;

            left = nextL ;
            right = nextR ;

        }
    }
    public static void main(String[] args) {
        zigzag_ll ll = new zigzag_ll() ;
        ll.addAtHead(1);
        ll.addAtHead(2);
        ll.addAtHead(3);
        ll.addAtHead(4);
        ll.addAtHead(5);

        ll.display() ;
        ll.zigzag();
        ll.display();
    } 
}
