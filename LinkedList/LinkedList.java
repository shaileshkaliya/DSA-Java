import java.util.Scanner;

public class LinkedList {

    //node creation 
    public static class Node{
        int data ;
        Node next ;

        public Node(int data){
            this.data = data ;
        }
    }

    // head and tail declaration 
    public static Node head ;
    public static Node tail ;

    //size of the linked list
    public static int size = 0 ;


    //insertion of node at head
    public void addAtHead(int data)          //TC is O(1)
    {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode ;
            size++ ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;
        size++ ;

    }


    //Insertion of node at tail
    public void addAtTail(int data)          //TC is O(1)
    {
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode ;
            size++ ;
        }
        tail.next = newNode ;
        tail = newNode ;
        size++ ;
    }


    //displaying the linked list
    public void display()
    {
        if(size == 0){
            System.out.println("Linked list is empty !");
        }
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next ;
        }
        System.out.println("null");
    }

    

    //adding node at random position
    public void addAtPosition(int data,int position){
        
        if(position > size-1){
            System.out.println("Invalid position to insert element");
            return ;
        }
        if(position == 0){
            addAtHead(data);
            return ;
        }
        if(position == size){
            addAtTail(data);
            return ;
        }

        int cnt = 0 ;
        Node temp = head ;
        while(cnt < position-2){
            cnt++;
            temp = temp.next ;
        }
        Node newNode = new Node(data) ;
        newNode.next = temp.next ;
        temp.next = newNode ;
        size++ ;

    }


    // deleting node at head 
    public void DeleteFromHead()
    {
        if(head == null){
            System.out.println("Linked list is empty");
            return ;
        }
        
        if(size == 1){
            head = tail = null ;
            return ;
        }
        head = head.next ;
        size-- ;

    }


    // deleting node from tail
    public void DeleteFromtail()
    {
        if(head == null){
            System.out.println("Linked list is empty ");
            return ;
        }
        
        if(size == 1){
            head = tail = null ;
            return ;
        }
        int cnt = 0;
        Node temp = head ;
        while(cnt < size-2){
            cnt++ ;
            temp = temp.next ;
        }

        temp.next = null ;
        size-- ;
    }


    //deleting node from random position
    public void DeleteAtPosition(int position)
    {
        if(position == 0){
            DeleteFromHead();
            return ;
        }
        if(position == size){
            DeleteFromtail();
            return ;
        }
        int cnt = 0 ;
        Node temp = head ;
        while(cnt < position-1)
        {
            cnt++;
            temp = temp.next ;
        }

        Node nodeToDlt = temp.next ;
        temp.next = temp.next.next ;
        nodeToDlt.next = null ;
        size-- ;

    }


    // searching for elemnt in the linked list iterative approach
    public int Search(int key) {
        Node temp = head ;
        int cnt = 0;
        while(temp != null) {
            if(temp.data == key){
                return cnt ;
            }
            cnt++ ;
            temp = temp.next ;
        }

        return -1 ;
    }


    // helper function for reccursive approach of search method
    public int helper(int key,Node head)
    {
        if(head == null){
            return -1 ;
        }
        if(key == head.data){
            return 0;
        }
        int idx = helper(key, head.next) ;
        if(idx == -1){
            return -1 ;
        }

        return idx+1 ;
    }


    // searching for element in the linked list recursive approach
    public int reccursiveSearch(int key)
    {
        return helper(key, head) ;
    }


    //reversing the linked list
    public void reverseList()
    {
        Node prev;
        Node curr,next ;
        prev = null ;
        curr = tail =head ;
        while(curr != null) {
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
        }

        head = prev ;
    }


    //removing nth node from the last in linked list
    public int removeNthNodeFromLast(int pos){
        int cnt = 0;
        Node temp = head ;
        while(cnt < size-pos-2){
            cnt++;
            temp = temp.next ;
        }
        Node toRemove = temp.next ;
        temp.next = temp.next.next ;
        toRemove.next = null ;
        size -- ;

        return toRemove.data ;
    }
    

    //find mid function with help of slow and fast pointer 
    public Node findMid()
    {
        Node slow = head , fast = head ;

        while(fast == null || fast.next == null){
            slow = slow.next ;
            fast = fast.next.next ;
        }
        
        return slow ;                     // Middle node is this 
    }

    
    //check for palindrome in linked list 
    public boolean isPalindrome()
    {
        if(head == null || head.next == null) {
            return true ;
        }
        Node prev = null ;
        Node curr = findMid() ;
        Node next ;

        while(curr != null) {
            next = curr.next ;
            prev = curr.next ;
            prev = curr ;
            curr = next ;
        }
        Node right = prev ;             // head for reversed right part of linked list
        Node left = head ;              // head for left part of linked list

        while(right != null){
            if(right.data != left.data){
                return false ;
            }
            left = left.next ;
            right = right.next ;
        }

        return true ;
    }


    
    //driver code 
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        int choice ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to add node at head ");
            System.out.println("Enter 2 to add node at tail ");
            System.out.println("Enter 3 to add node at any position ");
            System.out.println("Enter 4 to remove node at head ");
            System.out.println("Enter 5 to remove node at tail ");
            System.out.println("Enter 6 to remove node at any position ");
            System.out.println("Enter 7 to display the linked list ");
            System.out.println("Enter 8 to display size of linked list ");
            System.out.println("Enter 9 to search element in linked list ");
            System.out.println("Enter 10 to reverse the linked list ");
            System.out.println("Enter 11 to remove nth node from the end of linked list ");
            System.out.println("Enter 12 to check whether the linked list is palindrome or not ");
            System.out.println("Enter 0 to exit ");
   
            choice = sc.nextInt() ;

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add : ");
                    int d = sc.nextInt();
                    ll.addAtHead(d);
                    break;

                case 2:
                    System.out.print("Enter data to add : ");
                    int d2 = sc.nextInt();
                    ll.addAtTail(d2);
                    break;
                
                case 3:
                    System.out.print("Enter data to add : ");
                    int d3 = sc.nextInt();
                    System.out.print("Enter valid position to add data :");
                    int pos1 = sc.nextInt();
                    ll.addAtPosition(d3, pos1);                    
                    break;

                case 4:
                    ll.DeleteFromHead();
                    break;

                case 5:
                    ll.DeleteFromtail();
                    break ;

                case 6:
                    System.out.print("Enter position to delete element : ");
                    int pos2 = sc.nextInt();
                    ll.DeleteAtPosition(pos2);
                    break;

                case 7:
                    ll.display();
                    break;

                case 8:
                    System.out.println("Size of the linked list is : "+size );
                    break;

                case 9:
                    int key = sc.nextInt() ;
                    System.out.println("Index of element is : "+ll.Search(key));
                    break ;

                case 10:
                    ll.reverseList();
                    break ;
                
                case 11:
                    System.out.print("Enter position from end to delete the node : ");
                    int pos3 = sc.nextInt() ;
                    System.out.println("Deletd node data was : "+ll.removeNthNodeFromLast(pos3));
                    break ;

                case 12:
                    System.out.println("Linked list is palindrome : "+ll.isPalindrome());
                    break ;

                case 0:
                    break;
                
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 0);
         
    }
}
