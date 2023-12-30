public class mirrorBST {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

        public static Node mirror_bst(Node root){
            if(root == null){
                return null;
            }

            Node leftR = mirror_bst(root.left);
            Node rightR = mirror_bst(root.right);

            root.left = rightR;
            root.right = leftR;

            return root;
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void main(String[] args) {
            Node root = new Node(8);
            root.left = new Node(5);
            root.left.right = new Node(6);
            root.left.left = new Node(3);

            root.right = new Node(10);
            root.right.right = new Node(11);

            inorder(root);
            mirror_bst(root);
            System.out.println();
            inorder(root);
        }
}
