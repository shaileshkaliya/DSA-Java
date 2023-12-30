import java.util.ArrayList;

import org.w3c.dom.Node;

public class BST_to_balancedBST {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorderList(Node root,ArrayList<Integer>arr){
        if(root == null){
            return;
        }

        inorderList(root.left,arr);
        arr.add(root.data);
        inorderList(root.right,arr);
    }

    private static Node BalancedBST(ArrayList<Integer>arr,int st,int end){
        if(st > end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = BalancedBST(arr, st, mid-1);
        root.right = BalancedBST(arr, mid+1, end);

        return root;
    }
    public static Node convertToBalancedBST(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        inorderList(root, arr);
        root = BalancedBST(arr, 0, arr.size()-1);

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        preorder(root);
        root = convertToBalancedBST(root);
        System.out.println();
        preorder(root);
    }
}
