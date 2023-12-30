// public class sizeOfLargestBST {

//     static class Node{
//         int data;
//         Node left,right;

//         Node(int data){
//             this.data = data;
//             this.left = this.right = null;
//         }
//     }

//     static class Info{
//         boolean isBst;
//         int size;
//         int min;
//         int max;

//         Info(boolean isBst,int size,int min,int max){
//             this.isBst = isBst;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }

//     public static int maxBST = 0;

//     public static Info largestBST(Node root){
//         if(root == null){
//             return new Info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
//         }

//         Info leftR = largestBST(root.left);
//         Info rightR = largestBST(root.right);

//         int size = leftR.size+rightR.size+1;
//         int min = Math.min(root.data,Math.min(leftR.min,rightR.min));
//         int max = Math.max(root.data,Math.max(leftR.max,rightR.max));


//         if(root.data <= leftR.max || root.data >= rightR.min){
//             return new Info(false, size, min, max);
//         }

//         if(leftR.isBst && rightR.isBst){
//             System.out.println("checking");
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }

//         return new Info(false, size, min, max);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(50);
//         root.left = new Node(30);
//         root.left.left = new Node(5);
//         root.left.right = new Node(20);
//         root.right = new Node(60);
//         root.right.left = new Node(45);
//         root.right.right = new Node(70);
//         root.right.right.right = new Node(80);
//         root.right.right.left = new Node(65);

//         Info temp = largestBST(root);

//         System.out.println(maxBST);

//     }
// }


public class sizeOfLargestBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBst;
        int size;
        int min;
        int max;

        Info(boolean isBst, int size, int min, int max) {
            this.isBst = isBst;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftR = largestBST(root.left);
        Info rightR = largestBST(root.right);

        int size = 0;
        int min = root.data;
        int max = root.data;

        if (leftR.isBst && rightR.isBst && root.data > leftR.max && root.data < rightR.min) {
            size = leftR.size + rightR.size + 1;
            min = Math.min(root.data, leftR.min);
            max = Math.max(root.data, rightR.max);
            maxBST = Math.max(maxBST, size);
        } else {
            size = -1; // Indicates an invalid BST
        }

        return new Info(size != -1, size, min, max);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        Info temp = largestBST(root);

        System.out.println(maxBST);
    }
}
