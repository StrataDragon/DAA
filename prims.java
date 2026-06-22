package ia2;
import java.util.*;
class prims{
	public static void main(String args[]) {
		int w[][]=new int[10][10];
		int sol[]=new int[10];
		int flag=0,u=0,v=0,sum=0,min,k=0;
		System.out.println("Enter the number of vertices: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
			sol[i]=0;
		System.out.println("Enter the weight matrix: ");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				w[i][j]=sc.nextInt();
		System.out.println("Enter the source vertex: ");
		int s=sc.nextInt();
		sol[s]=1;
		k=1;
		while(k<=n-1) {
			 min=99;
			 for(int i=1;i<=n;i++) 
				 for(int j=1;j<=n;j++)
					 if(sol[i]==1 && sol[j]==0) 
						 if(i!=j && min>w[i][j]) {
							 min=w[i][j];
							 u=i;
							 v=j;
						 }
			sol[v]=1;
			k++;
			sum+=min;
			System.out.println(u+"->"+v+"="+min);
			
			
		}
		for(int i=1;i<=n;i++) {
			if(sol[i]==0) 
				flag=1;
		}
		if(flag==1) {
			System.out.println("No spanning tree");
		}else {
			System.out.println("min cost of the spanning tree: "+sum);
		}
	}
}