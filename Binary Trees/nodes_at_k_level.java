import org.w3c.dom.Node;

public class nodes_at_k_level {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kLevelNodes(Node root,int level,int k){
        if(root == null){
            return ;
        }

        if(level == k){
            System.out.print(root.data+" ");
        }

        kLevelNodes(root.left, level+1, k);
        kLevelNodes(root.right,level+1, k);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        kLevelNodes(root, 1, 4);

    }
}
