package ia2;
import java.util.*;
public class warshall {
	void warsh(int w[][],int n) {
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					w[i][j]= (w[i][j]!=0) || ((w[i][k]!=0) && (w[k][j]!=0)) ?1:0;
		
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		System.out.println("Enter number of vertices: ");
		int n=sc.nextInt();
		System.out.println("Enter the weighted matrix:");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=sc.nextInt();
		warshall wr=new warshall();
		wr.warsh(a, n);
		System.out.println("Transitive closure: ");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
		}		
	}
}
