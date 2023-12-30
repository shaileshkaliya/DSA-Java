
public class height_count_sum_functions {

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

        static class binaryTree{
            public static int height(Node root){
                if(root == null){
                    return 0;
                }

                int lh = height(root.left);
                int rh = height(root.right);

                return Math.max(lh,rh)+1;
            }

            public static int count(Node root){
                if(root == null){
                    return 0;
                }

                int leftNodes = count(root.left);
                int rightNodes = count(root.right);

                return leftNodes+rightNodes+1;
            }

            public static int sum(Node root){
                if(root == null){
                    return 0;
                }

                int leftSum = sum(root.left);
                int rightSum = sum(root.right);

                return leftSum+rightSum+root.data;
            }
            
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        binaryTree bt = new binaryTree();

        System.out.println(bt.sum(root));
        System.out.println();
        System.out.println(bt.count(root));
        System.out.println();
        System.out.println(bt.height(root));
    }
}
