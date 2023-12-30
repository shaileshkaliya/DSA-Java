import java.util.ArrayList;
import java.util.Collections;

public class job_sequencing {

    static class Job{
    int deadline;
    int profit;
    int id;

    public Job(int id,int profit,int deadline){
        this.profit = profit;
        this.deadline = deadline;
        this.id = id;
    }
}
    
    public static void main(String[] args) {
        int [][] job_pairs = {{4,20},{1,10},{1,40},{1,30}};

        // Job jobs[] = new Job[job_pairs.length];

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobs.size();i++){
            jobs.add(new Job(i,job_pairs[i][1],job_pairs[i][0]));
        }

        Collections.sort(jobs,(a,b) -> (b.profit-a.profit));
        
        for(int i=0;i<jobs.size();i++){
            System.out.print(jobs.get(i).deadline+" "+jobs.get(i).profit);
        }
        System.out.println();
        ArrayList<Integer> ans = new ArrayList<>();
        int total_profit=0;
        int time = 0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);

            if(time<curr.deadline){
                total_profit += curr.profit;
                time += 1;
                ans.add(curr.id);
            }
        }
        System.out.println(time);
        System.out.println("Total maximum profit is : "+total_profit);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
