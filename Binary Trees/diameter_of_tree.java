public class diameter_of_tree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static class Tree{
        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh,rh)+1;
        }

        public static int findDiameter(Node root){ // here TC is O(n^2) so it is not optimized
            if(root == null){
                return 0;
            }

            int leftDiam = findDiameter(root.left);
            int leftHt = height(root.left);

            int rightDiam = findDiameter(root.right);
            int rightHt = height(root.right);

            return Math.max(Math.max(leftDiam,rightDiam),leftHt+rightHt+1);
        }

        static class Info{
            int ht;
            int diam;

            Info(int ht,int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static Info findDiameter2(Node root){ // here TC is O(n) as here we visit each node only once

            if(root == null){
                return new Info(0,0);
            }

            Info leftNode = findDiameter2(root.left);
            Info rightNode = findDiameter2(root.right);

            int diam = Math.max(Math.max(leftNode.diam,rightNode.diam),leftNode.ht+rightNode.ht+1);
            int ht = Math.max(leftNode.ht,rightNode.ht)+1;

            return new Info(ht,diam);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        Tree bt = new Tree();

        System.out.println(bt.findDiameter(root));
        System.out.println(bt.findDiameter2(root).diam);
    }
}
