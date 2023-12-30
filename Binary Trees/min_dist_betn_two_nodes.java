
public class min_dist_betn_two_nodes {

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

    public static Node LCA(Node root, int n1, int n2){
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLCA = LCA(root.left,n1,n2);
        Node rightLCA = LCA(root.right,n1,n2);

        if(leftLCA == null){
            return rightLCA;
        }

        if(rightLCA == null){
            return leftLCA;
        }

        return root;
    }

    public static int findDistance(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = findDistance(root.left, n);
        int rightDist = findDistance(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist+1;
        }else{
            return leftDist+1;
        }
    }

    public static int min_distance(Node root, int n1, int n2){

        Node lcaNode = LCA(root, n1, n2);

        int leftDist = findDistance(lcaNode, n1);
        int rightDist = findDistance(lcaNode, n2);

        return leftDist+rightDist;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(min_distance(root, 4, 6));
    }
}
