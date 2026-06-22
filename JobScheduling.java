package hii;
import java.util.*;
class Job {
    int id, deadline, profit;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of jobs:");
        int n = sc.nextInt();

        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter id, deadline and profit for job " + (i + 1) + ":");
            int id = sc.nextInt();
            int deadline = sc.nextInt();
            int profit = sc.nextInt();

            jobs[i] = new Job(id, deadline, profit);
        }

        int maxProfit = jobsequencing(jobs, n);

        System.out.println("Maximum profit: " + maxProfit);

        sc.close();
    }

    public static int jobsequencing(Job[] jobs, int n) {

        // Sort jobs by profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        boolean[] result = new boolean[n];
        int[] jobsequence = new int[n];

        Arrays.fill(result, false);
        Arrays.fill(jobsequence, -1);

        int maxProfit = 0;

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {

                if (!result[j]) {
                    result[j] = true;
                    jobsequence[j] = i;
                    maxProfit += jobs[i].profit;
                    break;
                }
            }
        }

        System.out.println("Job sequence:");

        for (int i = 0; i < n; i++) {
            if (jobsequence[i] != -1) {
                System.out.print(jobs[jobsequence[i]].id + " ");
            }
        }

        System.out.println();

        return maxProfit;
    }
}