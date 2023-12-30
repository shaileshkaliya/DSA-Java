
public class k_th_ancestor {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static int kthAncestor(Node root,int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftNode = kthAncestor(root.left, n, k);
        int rightNode = kthAncestor(root.right, n, k);

        if(leftNode == -1 && rightNode == -1){
            return -1;
        }

        int max = Math.max(leftNode,rightNode);
        if(k == max+1){
            System.out.println(root.data);
        }

        return max+1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        kthAncestor(root, 7, 1);
    }
}
