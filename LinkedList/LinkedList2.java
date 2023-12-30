public class LinkedList2 {

    public class node{
        int data;
        node next;

        node(int data){
            this.data = data ;
        }
    }

    public static node head;
    public static node tail;

    public boolean detectCycle()
    {
        node slow=head , fast = head ;
        while(fast != null && fast.next != null ) {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                return true ;
            }
        }
        return false ;
    }

    public void removeCycle()                      
    {
        node slow = head , fast = head ;
        int flag = 0 ;

        while(fast != null && fast.next != null) {
            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return ;
        }

        slow = head ;
        node prev = null ;
        while(slow != fast){
            prev = fast ;
            slow = slow.next ;
            fast = fast.next ;
        }

        prev.next = null ;
    }
    public static void main(String[] args) {

        LinkedList2 ll = new LinkedList2() ;
        node node1 = ll.new node(10);
        node node2 = ll.new node(20);
        node node3 = ll.new node(30);
        node node4 = ll.new node(40);
        node node5 = ll.new node(40);

        head = node1 ;

        node1.next = node2 ;
        node2.next = node3 ;
        node3.next = node4 ;
        node4.next = node5 ;
        node5.next = node2 ;

        System.out.println(node1.data+"->"+node2.data+"->"+node3.data+"->"+node4.data+"->"+node5.data+"->null");

        System.out.println(ll.detectCycle());

        ll.removeCycle();
        System.out.println(ll.detectCycle());
    }
}
