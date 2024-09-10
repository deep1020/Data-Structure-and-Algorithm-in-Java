package Greedy;

import java.util.PriorityQueue;
import java.util.Arrays;

public class job_scheduling {
    static class Job {
        int deadline;
        int profit;
        public Job(int deadline,int profit) {
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static int jobScheduling(int[] deadlines, int[] profit) {
        int n=deadlines.length;
        PriorityQueue<Job> pq=new PriorityQueue<>((a,b)->b.profit-a.profit);
        for (int i=0;i<n;i++) {
            pq.offer(new Job(deadlines[i],profit[i]));
        }
        boolean[] slots=new boolean[n];
        Arrays.fill(slots,false);
        int totalProfit=0;
        while (!pq.isEmpty()) {
            Job job=pq.poll();
            int deadline=job.deadline;
            for (int i=deadline-1;i>=0;i--) {
                if (!slots[i]) {
                    slots[i]=true;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }
        return totalProfit;
    }
    public static void main(String[] args) {
        int deadlines[]={2,2,1,3,3};
        int profits[]={20,15,10,5,1};
        System.out.println(jobScheduling(deadlines,profits));
    }
}
//Input: deadlines = [2,2,1,3,3], profit = [20,15,10,5,1]
//Output: 40
//Input: deadlines = [3,4,4,2,3,1,2], profit = [35,30,25,20,15,12,5]
//Output: 110

// Create instances of Job for each job and store them in a priority queue, ordered by profit (highest profit first)
// Initialize an array to track time slots
// Initialize a variable to store the total profit
// Iterate through the priority queue
// Find the available time slot before the deadline
// Return the total profit