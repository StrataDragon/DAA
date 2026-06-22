package ia2;
import java.util.*;
class Dijikstras{
	static int n,s;
	static int cost[][]=new int[10][10];
	static int visited[]=new int[10];
	static int dist[]=new int[10];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter v:");
		n=sc.nextInt();
		System.out.println("Enter weigthed matrix: ");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				cost[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter source: ");
		s=sc.nextInt();
		dij();
		sc.close();
	}
	static void dij() {
		for(int i=1;i<=n;i++) {
			visited[i]=0;
			dist[i]=cost[s][i];
		}
		visited[s]=1;
		int count=1;
		while(count<n) {
			int min=999;
			int v=-1;
			for(int w=1;w<=n;w++)
				if(visited[w]==0 && dist[w]<min) {
					min=dist[w];
					v=w;
				}
			visited[v]=1;
			count++;
			for(int w=1;w<=n;w++)
				if(visited[w]==0 && dist[w]>dist[v]+cost[v][w]) {
					dist[w]=dist[v]+cost[v][w];
				}
		}
		System.out.println("Shortest path: ");
		for(int i=1;i<=n;i++) {
			if(i!=s)
				System.out.println(s+"->"+i+"="+dist[i]);
		}
	}
}