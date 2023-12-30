public class n_queen_count_ways {
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


    public static void NQueens(char board[][] , int row)
    {
        // base case
        if(row == board.length) {
            count++;
            return ;
        }

        // recurssion
        for(int j=0 ; j<board.length ; j++) {
           if(isSafe(board, row, j)){

               board[row][j] = 'Q' ;
               NQueens(board, row+1);
               board[row][j] = 'x' ;

           }
        }   
    }

    static int count = 0 ;
    public static void main(String[] args) {
        int n=5 ;
        char board[][] = new char[n][n] ;

        for(int i=0 ; i<board.length ; i++) {
            for(int j=0 ; j<board[0].length ; j++) {
                board[i][j] = 'x' ;
            }
        }

        NQueens(board, 0);
        System.out.println(count);
    }
}