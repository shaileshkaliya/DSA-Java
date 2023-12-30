import java.util.PriorityQueue;

public class weakest_soldiers {

    static class Soldiers implements Comparable<Soldiers> {
        int soldiers;
        int row;

        Soldiers(int soldiers, int row){
            this.soldiers = soldiers;
            this.row = row;
        }

        @Override
        public int compareTo(Soldiers s){
            if(this.soldiers == s.soldiers){
                return this.row-s.row;
            }else{
                return this.soldiers-s.soldiers;
            }
        }
    }
    public static void main(String[] args) {
        int[][] army = {
                        {1,0,0,0},
                        {1,1,1,1},
                        {1,0,0,0},
                        {1,0,0,0}
                    };

        PriorityQueue<Soldiers> pq = new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int sold = 0;
            for(int j=0;j<army[0].length;j++){
                sold+=(army[i][j]==1?1:0);
            }
            pq.add(new Soldiers(sold, i));
        }

        int k=2;
        
        for(int i=0;i<k;i++){
            System.out.println("r"+pq.remove().row+" ");
        }
    }
}
