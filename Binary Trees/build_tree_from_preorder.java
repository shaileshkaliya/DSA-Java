
public class build_tree_from_preorder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildTree{
        static int idx = -1;

        public static Node build_from_preorder(int[] nodes){
            idx++;
            if(nodes[idx]==-1 ){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = build_from_preorder(nodes);
            newNode.right = build_from_preorder(nodes);

            return newNode;
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BuildTree bt = new BuildTree();

        Node root = bt.build_from_preorder(nodes);

        System.out.println(root.data);
    }
}
