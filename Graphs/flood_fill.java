public class flood_fill {

    private static void helper(int[][] img, int sr, int sc, int color,boolean[][]vis, int originalColor){

        if (sr<0 || sr>=img.length || sc<0 || sc>=img[0].length || vis[sr][sc] || img[sr][sc]!=originalColor) {
            return;
        }

        img[sr][sc]=color;
        vis[sr][sc]=true;

        helper(img, sr-1, sc, color, vis, originalColor);
        helper(img, sr+1, sc, color, vis, originalColor);
        helper(img, sr, sc-1, color, vis, originalColor);
        helper(img, sr, sc+1, color, vis, originalColor);

    }
    public static void floodFill(int img[][], int sr, int sc, int color){
        boolean[][] vis = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, vis, img[sr][sc]);
    }
    public static void main(String[] args) {
        int img[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr=1;
        int sc=1;
        int color=2;

        floodFill(img, sr, sc, color);

        for(int i=0;i<img.length;i++){
            for(int j=0;j<img[0].length;j++){
                System.out.print(img[i][j]+" ");
            }
            System.out.println();
        }
    }
}
