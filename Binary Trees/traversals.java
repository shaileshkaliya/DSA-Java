import java.util.*;
public class traversals {

    static class Node{
        Node left,right;
        int data;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Trees{

        public static void preorder(Node root){
            if(root == null){
                return ;
            }

            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return ;
            }

            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }

            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();

                if(currNode == null){
                    System.out.println();

                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data);

                    if(currNode.left != null){
                        q.add(currNode.left);
                    }

                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Trees tree = new Trees();

        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrder(root);
        System.out.println();
    }
}
