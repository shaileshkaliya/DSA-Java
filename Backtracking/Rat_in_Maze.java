public class Rat_in_Maze {

    public static boolean isSafe(int maze[][],int row,int col)
    {
        if(row>=0 && row<maze.length && col>=0 && col<maze.length && maze[row][col]==1){
            return true ;
        }
        return false ;
    }

    public static boolean mazeSolver(int[][] maze,int row,int col,int soln[][])
    {
        // base case
        if(row == maze.length-1 && col == maze.length-1) {
            soln[row][col] = 1;
            display(soln);
            return true ;
        }
        
        if(isSafe(maze, row, col)){
            soln[row][col] = 1;
            if(mazeSolver(maze, row+1, col, soln)) {
                return true ;
            }
            if(mazeSolver(maze, row, col+1, soln)) {
                return true ;
            }
            if(mazeSolver(maze, row-1, col, soln)) {
                return true ;
            }
            if(mazeSolver(maze, row, col-1, soln)) {
                return true ;
            }

            soln[row][col] = 0;
        }

        return false ;

    }    
    public static void display(int[][]maze)
    {
        for(int i=0 ; i<maze.length ; i++){
            for(int j=0 ; j<maze[0].length ; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } }; 

        
        int soln[][] = new int[maze.length][maze.length] ;
        for(int i=0 ; i<soln.length ; i++){
            for(int j=0 ; j<soln.length ; j++){
                soln[i][j] = 0 ;
            }
        }

        
        if(mazeSolver(maze, 0, 0, soln)) {
            System.out.println("Solution is possible");
        }
        else {
            System.out.println("Sorry !");
        }

    }
}
