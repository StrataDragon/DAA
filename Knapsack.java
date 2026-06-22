package hii;

import java.util.*;

	 public class Knapsack {
	    int n;
	    double c, p[], w[];

    public Knapsack(int n, double c, double p[], double w[]) {
        super();
    	this.n = n;
        this.c = c;
        this.p = p;
        this.w = w;
    }

    void compute() {
        int i;
        double x[] = new double[n];

        for (i = 0; i < n; i++) {
            x[i] = 0.0;
        }

        double rc = c;

        for (i = 0; i < n; i++) {
            if (w[i] > rc) {
                break;
            }

            x[i] = 1.0;
            rc -= w[i];
        }

        if (i < n) {
            x[i] = rc / w[i];
        }

        double netProfit = 0.0;

        for (i = 0; i < n; i++) {
            netProfit += x[i] * p[i];
        }

        System.out.println("Solution vector:");
        for (i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        System.out.println("Net profit: " + netProfit);
    }

    static void sortbyRatio(double p[], double w[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (p[i] / w[i] < p[j] / w[j]) {

                    double temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;

                    temp = w[i];
                    w[i] = w[j];
                    w[j] = temp;
                }
            }
        }
    }
public class Gknapsack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of objects: ");
        int n = sc.nextInt();

        double p[] = new double[n];
        double w[] = new double[n];

        System.out.print("Enter capacity of knapsack: ");
        double c = sc.nextDouble();

        System.out.println("Enter profits:");
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextDouble();
        }

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextDouble();
        }

        Knapsack.sortbyRatio(p, w, n);

        Knapsack gk = new Knapsack(n, c, p, w);
        gk.compute();
        sc.close();
    }
}
}