
public class bst {
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

    public static Node create_BST(Node root,int data){
        if(root == null){
            Node newNode = new Node(data);
            return newNode;
        }

        if(data < root.data){
            root.left = create_BST(root.left, data);
        }else{
            root.right = create_BST(root.right, data);
        }

        return root;
    }

    private static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }

        return root;
    }
    public static Node deleteNode(Node root, int data){

        
        if(root == null){
            return null;
        }
        if(root.data > data){
            root.left = deleteNode(root.left, data);
        }else if(root.data < data){
            root.right = deleteNode(root.right, data);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }else if(root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }else{
                Node IS = InorderSuccessor(root.right);
                root.data = IS.data;
                root.right = deleteNode(root.right, IS.data);
            }
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        for(int i=0; i<values.length; i++){
            root = create_BST(root, values[i]);
        }

        inorder(root);

        System.out.println(deleteNode(root, 5));

        inorder(root);
    }
}
