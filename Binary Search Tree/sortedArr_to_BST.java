public class sortedArr_to_BST {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    private static Node helper(int arr[],int st,int end){

        if(st > end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = helper(arr, st, mid-1);
        root.right = helper(arr, mid+1, end);

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

    public static Node createBST(int arr[]){
        return helper(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        Node root = createBST(arr);
        inorder(root);
    }
}
