import javax.swing.plaf.synth.SynthSpinnerUI;

public class give_one_solution {
    
    public static void display(char board[][])
    {   System.out.println("-----------------Chess Board----------------");
        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board.length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][] , int row , int col)
    {
        // vertical up case
        for(int i=row-1 ; i>=0 ; i--) {
            if(board[i][col] == 'Q'){
                return false ;
            }
        }

        // vertical diagonally left up case 
        for(int i=row-1, j=col-1 ; i>=0 && j>=0 ; i--,j--) {
            
            if(board[i][j] == 'Q') {
                return false ;
            }
            
        }

        // vertcial diagonally right up case 
        for(int i=row-1, j=col+1 ; i>=0 && j<board.length ; i--,j++) {
            
            if(board[i][j] == 'Q') {
                return false ;
            }
            
        }

        return true ;
    } 


    public static boolean GiveOneSolutionNQueens(char board[][] , int row)
    {
        // base case
        if(row == board.length) {
            return true;
        }

        // recurssion
        for(int j=0 ; j<board.length ; j++) {
           if(isSafe(board, row, j)){

            board[row][j] = 'Q' ;
            if(GiveOneSolutionNQueens(board,row+1)){
                return true ;
            }
            board[row][j] = 'x' ;

           }
        }   

        return false ;
    }

    public static void main(String[] args) {
        int n=5 ;
        char board[][] = new char[n][n] ;

        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                board[i][j] = 'x' ;
            }
        }

        if(GiveOneSolutionNQueens(board, 0)){
            System.out.println("Solution is possible ");
            display(board);
        }
        else {
            System.out.println("Solution is not possible ");
        }
    }
}
