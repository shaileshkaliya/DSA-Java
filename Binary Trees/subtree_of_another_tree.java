import org.w3c.dom.Node;

public class subtree_of_another_tree {

    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static boolean isIdentical(Node node,Node subNode){
        if(node == null && subNode == null){
            return true;
        }else if(node == null || subNode == null || node.data != subNode.data){
            return false;
        }

        if(!isIdentical(node.left,subNode.left)){
            return false;
        }

        if(!isIdentical(node.right,subNode.right)){
            return false;
        }
        
        return true;
    }
    public static boolean isSubTree(Node root,Node subRoot){  // here our TC is O(n) only coz we are visiting each node only once
        if(root == null){
            return false;
        }

        if(root.data == subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }

        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    public static void main(String[] args) {
        

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node subRoot1 = new Node(2);
        subRoot1.left = new Node(4);
        subRoot1.right = new Node(5);

        Node subRoot2 = new Node(2);
        subRoot2.left = new Node(4);
        subRoot2.right = new Node(5);
        subRoot2.right.left = new Node(7);

        System.out.println(isSubTree(root, subRoot1));
        System.out.println(isSubTree(root, subRoot2));
    }
}
