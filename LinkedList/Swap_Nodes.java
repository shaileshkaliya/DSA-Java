public class Swap_Nodes {

    public class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data = data ;
            this.next = null ;
        }
    }

    public static Node head ;
    public static Node tail ;

    public void AddLast(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode ;
        }
        tail.next = newNode ;
        tail = newNode ;

    }

    public void SwapNodes(int x,int y)
    {
        if(head == null){
            System.out.println("LL is empty ");
            return ;
        }
        /*
         x = 3,y = 5
        1-2-3-4-5-6-7 
        */
        int cnt = 1 ;
        Node tempx = head ;
        while(cnt < x-1){
            tempx = tempx.next ;
            cnt++ ;
        }
        cnt = 1 ;
        Node tempy = head ;
        while(cnt < y-1){
            tempy = tempy.next ;
            cnt++ ;
        }

        Node temp1,temp2 ;
        temp1 = tempx.next ;
        temp2 = tempy.next ;

        tempx.next = temp2 ;
        temp2.next = temp1.next ;

        tempy.next = temp1 ;
        temp1.next = null ;

    }

    public void display()
    {
        Node temp = head ;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Swap_Nodes ll = new Swap_Nodes() ;
        ll.AddLast(1);
        ll.AddLast(2);
        ll.AddLast(3);
        ll.AddLast(4);

        ll.display();

        ll.SwapNodes(2, 4);

        ll.display();
    }   
}