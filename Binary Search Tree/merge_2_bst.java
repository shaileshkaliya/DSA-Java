import java.util.ArrayList;

import org.w3c.dom.Node;

public class merge_2_bst {

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

    private static void  mergeLists(ArrayList<Integer>arr1,ArrayList<Integer>arr2,ArrayList<Integer>arr){
        int i=0,j=0;
        while(i < arr1.size() && j < arr2.size()){
            if(arr1.get(i) < arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            }else{
                arr.add(arr2.get(j));
                j++;
            }
        }

        while(i<arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }

        while(j<arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }
    }

    private static Node createBST(ArrayList<Integer>arr,int st,int end){
        if(st > end){
            return null;
        }

        int mid = (st+end)/2;

        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static Node merge2BSTs(Node root1,Node root2){
        ArrayList<Integer>arr = new ArrayList<>();
        ArrayList<Integer>arr1 = new ArrayList<>();
        ArrayList<Integer>arr2 = new ArrayList<>();


        inorderList(root1, arr1);
        inorderList(root2, arr2);

        mergeLists(arr1, arr2, arr);

        Node root = createBST(arr, 0, arr.size()-1);

        return root;

    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        preorder(root1);
        System.out.println();
        preorder(root2);
        System.out.println();

        Node root = merge2BSTs(root1, root2);
        preorder(root);
    }
}
