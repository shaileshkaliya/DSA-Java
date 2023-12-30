
/*
 Approach 1 : check wheteher the inorder traversal of tree is in sorted ascending order or not if yes it is balanced otherwise it is not.

 Approach 2 : this code 
 */

public class isValidBst {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    private static boolean helper(Node root,Node min,Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }

        return helper(root.left, min, root) && helper(root.right,root,max);
    }

    public static boolean isValidBST(Node root){
        return helper(root,null,null);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);
        // root.right.right.right.right = new Node(7); if we add this node tree become invalid bst

        System.out.println(isValidBST(root));
    }
}
