public class sudoku_solver {


    public static boolean isSafe(int[][] sudoku,int digit,int rows,int cols) {
        // column case
        for(int i=0 ; i<rows ; i++) {
            if(sudoku[i][cols] == digit) {
                return false ;
            }
        }

        // rows case 
        for(int j=0 ; j<cols ; j++) {
            if(sudoku[rows][j] == digit) {
                return false ;
            }
        }

        // grid case 
        int startingRow = (rows/3)*3 ;
        int startingCol = (cols/3)*3 ;

        for(int i=startingRow ; i<startingRow+3 ; i++) {
            for(int j=startingCol ; j<startingCol+3 ; j++) {
                if(sudoku[i][j] == digit) {
                    return false ;
                }
            }
        }

        return true ;
    }
    public static boolean SudokuSolver(int [][] sudoku,int rows,int cols) 
    {
        //base case
        if(rows == 9) {
            return true ;
        }

        //recurssion
        int newRow,newCol ;
        newRow = rows ;
        newCol = cols+1 ;
        if(newCol == 9) {
            newRow++;
            newCol = 0;
        }

        if(sudoku[rows][cols] != 0) {
            return SudokuSolver(sudoku, newRow, newCol) ;
        }
        for(int digit=1 ; digit<=9 ; digit++)
        {
            if(isSafe(sudoku,digit,rows,cols)) {
                sudoku[rows][cols] = digit ;
                if(SudokuSolver(sudoku, newRow, newCol)) {
                    return true ;
                }
                sudoku[rows][cols] = 0 ;
            }
        }

        return false ;
    }

    public static void display(int[][] sudoku)
    {
        for(int i=0 ; i<9 ; i++) {
            for(int j=0 ; j<9 ; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
                          {4,9,0,1,5,7,0,0,2},
                          {0,0,3,0,0,4,1,9,0},
                          {1,8,5,0,6,0,0,2,0},
                          {0,0,0,0,2,0,0,6,0},
                          {9,6,0,4,0,5,3,0,0},
                          {0,3,0,0,7,2,0,0,4},
                          {0,4,9,0,3,0,0,5,7},
                          {8,2,7,0,0,9,0,1,3}} ;

        if(SudokuSolver(sudoku, 0, 0)) {
            display(sudoku);
        }
        else {
            System.out.println("Soluntion does not exist !");
        }
    }
}
