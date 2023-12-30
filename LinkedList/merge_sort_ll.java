import java.util.LinkedList;

public class merge_sort_ll {

    // public class Node{
    //     int data ;
    //     Node next ;

    //     Node(int data){
    //         this.data = data ;
    //     }
    // }

    // public Node head ;

    // public void addAtHead(int data)          //TC is O(1)
    // {
    //     Node newNode = new Node(data);
    //     if(head == null) {
    //         head = newNode ;
    //         return ;
    //     }
    //     newNode.next = head ;
    //     head = newNode ;

    // }


    // private Node findMid(Node temp)
    // {
    //     Node slow = temp ;
    //     Node fast = temp.next ;
    //     while(fast != null && fast.next != null){
    //         slow = slow.next ;
    //         fast = fast.next.next ;
    //     }
    //     return slow ;
    // } 


    // public Node mergeSort(Node temp){
    //     if(temp == null || temp.next == null){
    //         return temp ;
    //     }
    //     Node mid = findMid(temp) ;
    //     Node rightHead = mid.next ;
    //     mid.next = null ;

    //     Node lh = mergeSort(temp) ;
    //     Node rh = mergeSort(rightHead) ;

    //     return merge(lh,rh) ;

    // }


    // private Node merge(Node leftH,Node rightH)
    // {
    //     Node mergedLL = new Node(-1) ;
    //     Node temp = mergedLL ;

    //     while(leftH != null && rightH != null)
    //     {
    //         if(leftH.data <= rightH.data){
    //             temp.next = leftH ;
    //             leftH = leftH.next ;
    //             temp = temp.next ;
    //         }
    //         else {
    //             temp.next = rightH ;
    //             rightH = rightH.next ;
    //             temp = temp.next ;
    //         }

    //         while(leftH != null){
    //             temp.next = leftH ;
    //             leftH = leftH.next ;
    //             temp = temp.next ;
    //         }
    //         while(rightH != null){
    //             temp.next = rightH ;
    //             rightH = rightH.next ;
    //             temp = temp.next ;
    //         }
    //     }
    //     return mergedLL.next ;
    // }

    // public void display()
    // {
    //     Node temp = head ;
    //     while(temp != null){
    //         System.out.print(temp.data+"->");
    //         temp = temp.next ;
    //     }
    //     System.out.println("null");
    // }

    public class Node {
        int data ;
        Node next ;
        Node (int data ){
            this.data = data ;
        }
    }

    public static Node head ;

    public void AddFirst(int data)
    {
        Node newNode = new Node(data) ;
        if(head == null){
            head = newNode ;
            return ;
        }

        newNode.next = head ;
        head = newNode ;

    }

    private Node findMid(Node temp)
    {
        Node slow = temp ;
        Node fast = temp.next ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        return slow ;
    }

    private Node Merge(Node left,Node right)
    {
        Node mergedLL = new Node(-1) ;
        Node temp = mergedLL ;

        while(left != null && right != null){
            if(left.data <= right.data){
                temp.next = left ;
                left = left.next ;
                temp = temp.next ;
            }
            else {
                temp.next = right ;
                right = right.next ;
                temp = temp.next ;
            }
            
        }
        while(left != null){
            temp.next = left ;
            left = left.next ;
            temp = temp.next ;
        }
        while(right != null){
            temp.next = right ;
            right = right.next ;
            temp = temp.next ;
        }
        
        return mergedLL.next ;
    }

    public Node MergeSort(Node head)
    {
        // base case 
        if(head == null || head.next == null){
            return head ;
        }

        // find mid
        Node mid = findMid(head) ;
        Node rHead = mid.next ;
        mid.next = null ;

        // MergeSort 
        Node lh = MergeSort(head) ;
        Node rh = MergeSort(rHead) ;

        // Merge the two nodes
        return Merge(lh,rh) ;
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
    public static void main(String[] args) {
        merge_sort_ll ll = new merge_sort_ll() ;
        ll.AddFirst(0);
        ll.AddFirst(50);
        ll.AddFirst(25);
        ll.AddFirst(60);
        ll.AddFirst(9);

        // 9->60->25->50->0 

        ll.display();
        head = ll.MergeSort(head) ;
        ll.display();
    }
}
