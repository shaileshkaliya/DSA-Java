import java.util.*;

public class lowest_common_ancestor {
    
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private static boolean findPath(Node root,int n, ArrayList<Integer> path){
        if(root == null){
            return false;
        }

        path.add(root.data);

        if(root.data == n){
            return true;
        }

        boolean findLeft = findPath(root.left, n, path);
        boolean findRight = findPath(root.right, n, path);

        if(findLeft || findRight){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
 
    public static int LCA(Node root, int n1,int n2){ // here TC is O(m) only but the SC is O(n^2) so it is not optmized
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        findPath(root, n1, path1);
        findPath(root, n2, path2);

        int i=0;

        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        return path1.get(i-1);
    }

    public static Node LCA_optimized(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }


        Node leftLCA = LCA_optimized(root.left, n1, n2);
        Node rightLCA = LCA_optimized(root.right, n1, n2);

        if(leftLCA == null){
            return rightLCA;
        }else if(rightLCA == null){
            return leftLCA;
        } 

        return root;
    }

     public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.right = new Node(7);

        System.out.println(LCA(root, 4, 5));
        System.out.println(LCA_optimized(root, 4, 5).data);
    }
}
