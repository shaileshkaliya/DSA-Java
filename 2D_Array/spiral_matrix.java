// package 2-D Array;

public class spiral_matrix {

    public static void SpiralMatrix(int a[][]) {
        int startrow,startcol,endrow,endcol;
        startrow = 0 ;
        startcol = 0 ;
        endrow = a.length-1 ;
        endcol = a[0].length-1 ;
        int i,j;
        while(startrow <= endrow && startcol <= endcol) {
            
            //top
            for(j=startcol ; j<=endcol ; j++){
                System.out.print(a[startrow][j]+" ");
            }

            //right
            for(i=(startrow+1) ; i<=endrow ; i++) {
                System.out.print(a[i][endrow]+" ");
            }

            //bottom
            for(j=(endcol-1) ; j>=startcol ; j--) {
                if(startrow == endrow) {
                    break;
                }
                System.out.print(a[endrow][j]+" ");
            }

            //left
            for(i=endrow-1 ; i>startrow ; i--) {
                if(startcol == endcol) {
                    break;
                }
                System.out.print(a[i][startcol]+" ");
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{9,1,3},{5,7,6},{8,2,4},};

        SpiralMatrix(arr);

        
    }
}
