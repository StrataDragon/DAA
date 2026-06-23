package endsem;
import java.util.Scanner;
public class sumofsubsets {
    static boolean found=false;
    static void subset(int a[],int n,int sum,int k,String set) {
    	if(sum==0) {
    		System.out.println("{"+set+" }");
    		found=true;
    		return;
    	}
    	if(k==n||sum<0)
    		return;
    	
    	subset(a,n,sum-a[k],k+1,set+" "+a[k]);
    	subset(a,n,sum,k+1,set);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter required sum: ");
        int d = sc.nextInt();

        System.out.println("Subsets are:");
        subset(a, n, d, 0, "");

        if (!found)
            System.out.println("Subset is not possible!");
        sc.close();
    }
}
